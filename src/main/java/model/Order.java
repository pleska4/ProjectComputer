package model;

public class Order extends AbstractEntity{
    private Integer price;

    public Order(Integer percent) {
        this.price = percent;
    }

    public Order() {
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer percent) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Order [ id " + getId() + ", price=" + price + "]";
    }

}
