package parsing.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class CustomerPars  {
    @JsonProperty
    private Integer id;
    @JsonProperty
    private String name;
    @JsonProperty
    private Integer customers_phone;

    @JsonProperty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
    private Date birthday;


    public CustomerPars(Integer id, String name, Integer customers_phone) {
        this.id = id;
        this.name = name;
        this.customers_phone = customers_phone;
            }

    public CustomerPars() {
    }

    public static void setBirthday(Date birthday) {
    }

    public static void setCustomers_phone(String customers_phone) {
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

    public Date getBirthday() {
        return birthday;
    }
}

