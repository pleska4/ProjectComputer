package techstation.implementation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import techstation.connectionpool.ConnectionPool;
import techstation.interfaces.IPaymentDAO;
import techstation.model.Payment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PaymentDAO implements IPaymentDAO {
    private static final Logger LOGGER = LogManager.getLogger(Payment.class);
    private static final Properties p = new Properties();
    private final Payment payment = new Payment();
    private final ConnectionPool connectionPool = ConnectionPool.getInstance();
    private Connection connection;
    private PreparedStatement pr = null;
    private ResultSet resultSet = null;

    @Override
    public Payment getEntityById(int id) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from payments where id=?");
            pr.setInt(1, id);
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                payment.setId();
                payment.setSum(resultSet.getInt("summa"));
                payment.setDiscount(resultSet.getInt("discount"));

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
        return payment;
    }

    @Override
    public void saveEntity(Payment entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Insert into payment (Summa,Discount Values (?,?)");
            pr.setInt(1, entity.getSum());
            pr.setInt(2, entity.getDiscount());
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
    public void updateEntity(Payment entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Update payments Set Sum=?, Discount=? where id=?");
            pr.setInt(1, entity.getSum());
            pr.setInt(2, entity.getDiscount());
            pr.setLong(3, entity.getId());
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
    public void removeEntity(Payment entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Delete from payments where id=?");
            pr.setLong(1, entity.getId());
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
            pr = connection.prepareStatement("Select * from cars");
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                payment.setId();
                payment.setSum(resultSet.getInt("summa"));
                payment.setDiscount(resultSet.getInt("discount"));
                LOGGER.info(payment);
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
    public List<Payment> getPayments() {
        List<Payment> payments = new ArrayList<>();
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from cars");
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                Payment payment = new Payment();
                payment.setId();
                payment.setId();
                payment.setSum(resultSet.getInt("summa"));
                payment.setDiscount(resultSet.getInt("discount"));
                payments.add(payment);
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
            return payments;
        }
    }
}


