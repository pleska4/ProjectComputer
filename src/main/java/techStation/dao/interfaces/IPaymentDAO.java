package techStation.interfaces;

import techStation.model.Payment;

import java.util.List;

public interface IPaymentDAO extends techStation.interfaces.IDefaultDAO<Payment> {
    void viewAll();

    List<Payment> getPayments();
}

