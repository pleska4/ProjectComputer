package parsing.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderPars  {
    @JsonProperty
    private Integer id;
    @JsonProperty
    private Integer price;

    public OrderPars(Integer price) {
        this.price = price;
    }

    public OrderPars() {
    }

    public static void setPrice(String price) {
    }

    public static void setId(String id) {
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Order [ id " + getId() + ", price=" + price + "]";
    }

}
