package model;

public class DiscountCard extends AbstractEntity{
    private Integer percent;

   public DiscountCard(Integer percent) {
        this.percent = percent;
           }

    public DiscountCard() {
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }


    @Override
    public String toString() {
        return "DiscountCard [ id " + getId() + ", percent=" + percent + "]";
    }

}