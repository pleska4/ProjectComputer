package dao;

import model.Order;

public interface IOrderDAO extends IDefaultDAO<Order> {
    void viewAll();
}
