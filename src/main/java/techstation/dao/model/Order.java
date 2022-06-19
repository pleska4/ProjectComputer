package techstation.model;


public class Order  {
    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    private Integer id;
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
