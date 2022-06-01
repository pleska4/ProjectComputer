package dao;
import model.DiscountCard;

public interface IDiscountCardDAO extends IDefaultDAO<DiscountCard> {
    void viewAll();

}