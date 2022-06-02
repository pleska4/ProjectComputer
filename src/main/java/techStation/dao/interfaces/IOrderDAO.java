package techStation.interfaces;

import techStation.model.Order;

import java.util.List;

public interface IOrderDAO extends techStation.interfaces.IDefaultDAO<Order> {
    void viewAll();

    List<Order> getOrders();
}
