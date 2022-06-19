package techstation.interfaces;
import techstation.model.Customer;

public interface ICustomerDAO extends techstation.interfaces.IDefaultDAO<Customer> {
    void generateCustomers(String name, int customers_phone);

    void viewAll();
}
