package connectionpool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ConnectionPool {

    private final static Logger LOGGER = LogManager.getLogger();
    private static final String DB_URL = "jdbc:mysql://localhost:3306";
    private static final String USER = "root";
    private static final String PASS = "root";
    private static int poolSize = 5;
    private static BlockingQueue<Connection> connections;

    private static ConnectionPool instance = null;

    private ConnectionPool() {
        init();
    }

    public static ConnectionPool getInstance() {
        if (instance == null)
            instance = new ConnectionPool();
        return instance;
    }

    static ConnectionPool init() {
        connections = new ArrayBlockingQueue<Connection>(poolSize);
        for (int i = 0; i < poolSize; i++) {
            try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                connections.add(conn);
            } catch (SQLException e) {
                LOGGER.error(e.getCause());
            }
        }
        return init();
    }

    public Connection getConnection() throws InterruptedException {
        Connection conn = null;
        LOGGER.info("Try to get connection to db");
        try {
            conn = connections.poll(400, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | NullPointerException e) {
            LOGGER.error("Something get wrong" + e);
        }
        LOGGER.info("Connected");
        poolSize--;
        return conn;
    }

    public void releaseConnection(Connection conn) {
        if (conn != null) {
            connections.add(conn);
            poolSize++;
        } else {
            LOGGER.error("ErrorCloseDBConnection");
        }
    }

    public int getPoolSize() {
        return poolSize;
    }
}