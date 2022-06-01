package dao;
import model.Customer;

public interface ICustomerDAO extends IDefaultDAO<Customer> {
    void viewAll();
}
