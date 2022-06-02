package techStation.model;


public class OrderPars  {
    private Integer price;

    public OrderPars(Integer price) {
        this.price = price;
    }

    public OrderPars() {
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
