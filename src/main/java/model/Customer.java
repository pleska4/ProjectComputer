package model;

public class Customer extends AbstractEntity{
    private String name;
    private Integer customers_phone;


    public Customer(String name, Integer customers_phone) {
        this.name = name;
        this.customers_phone = customers_phone;
            }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCustomers_phone() {
        return customers_phone;
    }

    public void setCustomers_phone(Integer customers_phone) {
        this.customers_phone = customers_phone;
    }


    @Override
    public String toString() {
        return "Customer [ id " + getId() + ", name=" + name + ", customers_phone=" + customers_phone+ "]";
    }

}

