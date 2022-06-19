package techstation.interfaces;

import techstation.model.Payment;

import java.util.List;

public interface IPaymentDAO extends techstation.interfaces.IDefaultDAO<Payment> {
    void viewAll();

    List<Payment> getPayments();
}

