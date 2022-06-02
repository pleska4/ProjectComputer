

public class PaymentPars  {


    private Integer id;
    private Integer sum;
    private Integer discount;

    public PaymentPars(Integer sum, Integer discount) {
        this.sum = sum;
        this.discount = discount;
    }

    public PaymentPars() {

    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Payments [ id " + getId() + ", sum=" + sum + ", discount=" + discount + "]";
    }

}
