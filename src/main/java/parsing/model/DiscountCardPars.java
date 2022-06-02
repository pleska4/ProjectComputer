

public class DiscountCardPars  {

    private Integer id;
    private Integer percent;


    public DiscountCardPars(Integer percent) {
        this.percent = percent;
           }

    public DiscountCardPars() {
    }

    public Integer getPercent(int percent) {
        return this.percent;
    }

    public int setPercent() {
        this.percent = percent;
        return 0;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DiscountCard [ id " + getId() + ", percent=" + percent + "]";
    }

}