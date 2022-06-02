
public class OrderPars  {
    private Integer id;
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
