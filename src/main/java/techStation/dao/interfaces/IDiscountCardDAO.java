package techStation.interfaces;
import techStation.model.DiscountCard;

import java.util.List;

public interface IDiscountCardDAO extends techStation.interfaces.IDefaultDAO<DiscountCard> {
    void generateDiscountCard(int percent);

    void viewAll();

    List<DiscountCard> getDiscountCards();
}