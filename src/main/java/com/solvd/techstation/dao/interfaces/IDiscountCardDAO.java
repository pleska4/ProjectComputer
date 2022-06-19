package techstation.interfaces;
import techstation.model.DiscountCard;

import java.util.List;

public interface IDiscountCardDAO extends techstation.interfaces.IDefaultDAO<DiscountCard> {
    void generateDiscountCard(int percent);

    void viewAll();

    List<DiscountCard> getDiscountCards();
}