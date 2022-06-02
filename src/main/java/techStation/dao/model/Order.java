package techStation.model;


public class Order extends techStation.model.AbstractEntity {
    private Integer price;

    public Order(Integer price) {
        this.price = price;
    }

    public Order() {
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Order [ id " + getId() + ", price=" + price + "]";
    }

}
