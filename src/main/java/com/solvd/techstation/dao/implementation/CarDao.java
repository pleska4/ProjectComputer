package techstation.implementation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import techstation.connectionpool.ConnectionPool;
import techstation.interfaces.ICarDAO;
import techstation.model.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CarDao implements ICarDAO {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Properties p = new Properties();
    private final Car car = new Car();
    private final ConnectionPool connectionPool = ConnectionPool.getInstance();
    private Connection connection;
    private PreparedStatement pr = null;
    private ResultSet resultSet = null;

    @Override
    public Car getEntityById(int id) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from cars where id=?");
            pr.setInt(1, id);
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                car.setId();
                car.setModel(resultSet.getString("model"));
                car.setRegistration_number(resultSet.getString("registration_number"));
                car.setTechnical_sertificate_id(resultSet.getString("technical_sertificate_id"));
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
        return car;
    }

    @Override
    public void saveEntity(Car entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Insert into cars (Model,Registration_number, Technical_sertificate_id) Values (?,?)");
            pr.setString(1, entity.getModel());
            pr.setString(2, String.valueOf(entity.getRegistration_number()));
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
    public void updateEntity(Car entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Update cars Set Model=?,`Registration_number`=?, ,`Technical_sertificate_id`=? where id=?");
            pr.setString(1, entity.getModel());
            pr.setString(2, entity.getRegistration_number());
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
    public void removeEntity(Car entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Delete from cars where id=?");
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
                car.setId();
                car.setModel(resultSet.getString("Model"));
                car.setRegistration_number(resultSet.getString("Registration_number"));
                car.setTechnical_sertificate_id(resultSet.getString("technical_sertificate_id"));
                LOGGER.info(car);
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
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from cars");
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                Car car = new Car();
                car.setId();
                car.setModel(resultSet.getString("Model"));
                car.setRegistration_number(resultSet.getString("Registration_number"));
                car.setTechnical_sertificate_id(resultSet.getString("technical_sertificate_id"));
                cars.add(car);
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
            return cars;
        }
    }
}

