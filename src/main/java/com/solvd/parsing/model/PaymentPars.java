package parsing.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentPars  {

    @JsonProperty
    private Integer id;
    @JsonProperty
    private Integer sum;
    @JsonProperty
    private Integer discount;

    public PaymentPars(Integer sum, Integer discount) {
        this.sum = sum;
        this.discount = discount;
    }

    public PaymentPars() {

    }

    public static void setCustomerPars(CustomerPars customPars) {
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
