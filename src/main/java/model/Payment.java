package model;

public class Payment extends AbstractEntity{
    private Integer sum;
    private Integer discount;

    public Payment(Integer sum, Integer discount) {
        this.sum = sum;
        this.discount = discount;
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
    @Override
    public String toString() {
        return "Payments [ id " + getId() + ", sum=" + sum + ", discount=" + discount + "]";
    }

}
