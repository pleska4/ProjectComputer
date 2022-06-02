package techStation.interfaces;
import techStation.model.Customer;

public interface ICustomerDAO extends techStation.interfaces.IDefaultDAO<Customer> {
    void generateCustomers(String name, int customers_phone);

    void viewAll();
}
