package dao;

import model.Payment;

public interface IPaymentDAO extends IDefaultDAO<Payment> {
    void viewAll();
}

