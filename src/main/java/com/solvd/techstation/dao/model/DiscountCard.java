package techstation.model;

public class DiscountCard extends techstation.model.AbstractEntity {
     private Integer percent;


    public DiscountCard(Integer percent) {
        this.percent = percent;
           }

    public DiscountCard() {
    }

    public Integer getPercent(int percent) {
        return this.percent;
    }

    public int setPercent() {
        this.percent = percent;
        return 0;
    }


    @Override
    public String toString() {
        return "DiscountCard [ id " + getId() + ", percent=" + percent + "]";
    }

}