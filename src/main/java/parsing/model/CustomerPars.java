public class CustomerPars  {
    private Integer id;
    private String name;
    private Integer customers_phone;

    public CustomerPars(Integer id, String name, Integer customers_phone) {
        this.id = id;
        this.name = name;
        this.customers_phone = customers_phone;
            }

    public CustomerPars() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomers_phone() {
        return customers_phone;
    }

    public void setCustomers_phone(Integer customers_phone) {
        this.customers_phone = customers_phone;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer [ id " + getId() + ", name=" + name + ", customers_phone=" + customers_phone+ "]";
    }

    public int setId() {
        this.id = id;
        return 0;
    }
    public int getId(int id) {
        return id;
    }
}

