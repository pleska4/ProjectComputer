package techstation.implementation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import techstation.interfaces.ICustomerDAO;
import techstation.connectionpool.ConnectionPool;
import techstation.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class CustomerDAO implements ICustomerDAO {
    private static final Logger LOGGER = LogManager.getLogger(CustomerDAO.class);
    private static final Properties p = new Properties();
    private final Customer user = new Customer();
    private final ConnectionPool connectionPool = ConnectionPool.getInstance();
    private Connection connection;
    private PreparedStatement pr = null;
    private ResultSet resultSet = null;

    @Override
    public Customer getEntityById(int id) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from Customers where id=?");
            pr.setInt(1, id);
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                user.setId();
                user.setName(resultSet.getString("name"));
                user.setCustomers_phone(resultSet.getInt("customers_phone"));
            }

        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            try {
                if (connection != null) connectionPool.putback(connection);
                if (pr != null) pr.close();
                if (resultSet != null) resultSet.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
        return user;
    }

    @Override
    public void saveEntity(Customer entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Insert into customers (name,customers_phone) Values (?,?)");
            pr.setString(1, entity.getName());
            pr.setInt(2, entity.getCustomers_phone());
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
    public void updateEntity(Customer entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Update users Set name=?,`customers_phone`=? where id=?");
            pr.setString(1, entity.getName());
            pr.setInt(2, entity.getCustomers_phone());
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
    public void removeEntity(Customer entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Delete from customers where id=?");
            pr.setInt(1, entity.getId());
            pr.execute();
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
    public void generateCustomers(String name, int customers_phone) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Insert into customers (name,customers_phone) Values (?,?,?)");
            for (int i = 0; i < 2; i++) {
                pr.setString(1, name + "_" + i);
                pr.setInt(2, Integer.parseInt(customers_phone + "_" + i));
                pr.executeUpdate();
            }
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
            pr = connection.prepareStatement("Select * From Customers");
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                user.setId();
                user.setName(resultSet.getString("name"));
                user.setCustomers_phone(resultSet.getInt("phone"));
                LOGGER.info(user);
            }

        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            try {
                if (connection != null) connectionPool.putback(connection);
                if (pr != null) pr.close();
                if (resultSet != null) resultSet.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
    }
}
