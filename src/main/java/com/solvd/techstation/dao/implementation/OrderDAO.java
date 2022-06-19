package techstation.implementation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import techstation.connectionpool.ConnectionPool;
import techstation.model.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class OrderDAO implements techstation.interfaces.IOrderDAO {
    private static final Logger LOGGER = LogManager.getLogger(OrderDAO.class);
    private static final Properties p = new Properties();
    private final Order order = new Order();
    private final ConnectionPool connectionPool = ConnectionPool.getInstance();
    private Connection connection;
    private PreparedStatement pr = null;
    private ResultSet resultSet = null;

    @Override
    public Order getEntityById(int id) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from orders where id=?");
            pr.setInt(1, id);
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                order.setId();
                order.setPrice(resultSet.getInt("price"));
            }
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            try {
                if (connection != null) connectionPool.putback(connection);
                if (resultSet != null) resultSet.close();
                if (pr != null) pr.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
        return order;
    }

    @Override
    public void saveEntity(Order entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement
                    ("Insert into orders (price) Values (?)");
            pr.setInt(2, entity.getPrice());
            pr.executeUpdate();
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            try {
                if (connection != null) connectionPool.putback(connection);
                if (pr != null) pr.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
    }

    @Override
    public void updateEntity(Order entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement
                    ("Update orders Set price where id=?");
            pr.setInt(1, entity.getPrice());
            pr.setInt(2, entity.getId());
            pr.executeUpdate();
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            try {
                if (connection != null) connectionPool.putback(connection);
                if (pr != null) pr.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
    }

    @Override
    public void removeEntity(Order entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Delete from orders where id=?");
            pr.setInt(1, entity.getId());
            pr.executeUpdate();
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            try {
                if (connection != null) connectionPool.putback(connection);
                if (pr != null) pr.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
    }

    @Override
    public void viewAll() {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from orders");
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                order.setId();
                order.setPrice(resultSet.getInt("price"));
                LOGGER.info(order);
            }
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            try {
                if (connection != null) connectionPool.putback(connection);
                if (resultSet != null) resultSet.close();
                if (pr != null) pr.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
    }

    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from orders");
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                Order order = new Order();
                order.setId();
                order.setPrice(resultSet.getInt("price"));
                orders.add(order);
            }
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            try {
                if (connection != null) connectionPool.putback(connection);
                if (resultSet != null) resultSet.close();
                if (pr != null) pr.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
        return orders;
    }
}