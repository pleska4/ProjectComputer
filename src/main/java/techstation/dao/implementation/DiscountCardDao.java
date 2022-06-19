package techstation.implementation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import techstation.interfaces.IDiscountCardDAO;
import techstation.connectionpool.ConnectionPool;
import techstation.model.DiscountCard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DiscountCardDao implements IDiscountCardDAO {
    private static final Logger LOGGER = LogManager.getLogger(DiscountCard.class);
    private static final Properties p = new Properties();
    private final DiscountCard user = new DiscountCard();
    private final ConnectionPool connectionPool = ConnectionPool.getInstance();
    private Connection connection;
    private PreparedStatement pr = null;
    private ResultSet resultSet = null;

    @Override
    public DiscountCard getEntityById(int id) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * From DiscountCards where id=?");
            pr.setInt(1, id);
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                user.setId();
                user.getPercent(resultSet.getInt("percent"));
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
    public void saveEntity(DiscountCard entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Insert into DiscountCards (percent) Values (?)");
            pr.setInt(1, entity.getId());
            pr.setInt(2, entity.getPercent(resultSet.getInt("percent")));
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
    public void updateEntity(DiscountCard entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Update DiscountCard Set percent=? where id=?");
            pr.setInt(1, entity.setId());
            pr.setInt(1, entity.setPercent());
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
    public void removeEntity(DiscountCard entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Delete from DiscountCards where id=?");
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
    public void generateDiscountCard(int percent) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Insert into DiscountCards (percent) Values (?)");
            for (int i = 0; i < 5; i++) {
                pr.setInt(1, Integer.parseInt(percent + "_" + i));
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
            pr = connection.prepareStatement("Select * From DiscountCards");
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                user.setId();
                user.setPercent();
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
    @Override
    public List<DiscountCard> getDiscountCards() {
        List<DiscountCard> discountCards = new ArrayList<>();
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from cards");
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                DiscountCard discountCard = new DiscountCard();
                discountCard.setId();
                discountCard.setPercent();
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
            return discountCards;
        }
    }
}


