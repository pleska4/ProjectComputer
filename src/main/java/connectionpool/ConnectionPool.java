package connectionpool;

import org.apache.commons.dbutils.DbUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class ConnectionPool {

    private static final ConnectionPool cp = new ConnectionPool();
    private final static Logger LOGGER = LogManager.getLogger();
    private static String url = "jdbc:mysql://localhost:3306";
    private static String user = "root";
    private static String password = "root";
    private static int connSize;
    private static BlockingQueue<Connection> connections;
    private static ReentrantLock locker = new ReentrantLock();
    private static ArrayBlockingQueue<Connection> freeConns;

    private ConnectionPool() {
        try {
//			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Properties props = new Properties();
            props.load(new FileReader("src\\main\\resources\\db.properties"));
            Class.forName(props.getProperty("driver"));
            String url = props.getProperty("url");
            String user = props.getProperty("user");
            String password = props.getProperty("password");
            int connSize = Integer.parseInt(props.getProperty("connSize"));
            setCp(url, user, password, connSize);
        } catch (IOException e) {
            LOGGER.log(Level.ERROR, "Can`t read file");
        } catch (ClassNotFoundException e) {
            LOGGER.log(Level.ERROR, "ClassNotFoundException");
        }
    }

    public static ConnectionPool getCp() {
        return cp;
    }

    public static ConnectionPool setCp(String url, String user, String password, int connSize) {
        ConnectionPool.url = url;
        ConnectionPool.user = user;
        ConnectionPool.password = password;
        ConnectionPool.connSize = connSize;
        ConnectionPool.freeConns = new ArrayBlockingQueue<Connection>(connSize);
        return cp;
    }

    public int getFreeConnsSize() {
        return freeConns.size();
    }

    private void createConnection() {
        try {
            connSize--;
            freeConns.add(DriverManager.getConnection(url, user, password));
			LOGGER.log(Level.INFO, "new connection was created.");
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "ERROR create connection");
        }
    }

    public Connection getConnection() {
        locker.lock();
        Connection conn = null;
        try {
            if (freeConns.size() == 0 && connSize > 0) {
                createConnection();
            }
            conn = freeConns.take();
        } catch (InterruptedException e) {
            LOGGER.log(Level.ERROR, "ERROR take connection", e);
        } finally {
            locker.unlock();
        }
        return conn;
    }

    public void returnConnection(Connection conn) {
        freeConns.add(conn);
		LOGGER.log(Level.INFO, "free connection was placed in the queue. Size: " + getFreeConnsSize());
    }

    public void deleteConnection(Connection conn) {
        DbUtils.closeQuietly(conn);
        connSize++;
        LOGGER.log(Level.INFO, "connection was closed");
    }
}