package techstation.interfaces;

import techstation.model.Order;

import java.util.List;

public interface IOrderDAO extends techstation.interfaces.IDefaultDAO<Order> {
    void viewAll();

    List<Order> getOrders();
}
