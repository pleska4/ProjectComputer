package dao;

import model.Payment;

public interface IPaymentDAO extends IDefaultDao<Payment> {
    void viewAll();
}

