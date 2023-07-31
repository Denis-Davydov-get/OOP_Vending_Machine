package Vending.Coparator;
import Vending.Food;

import java.util.Comparator;

public class FoodComparator implements Comparator<Food> {

    @Override
    public int compare(Food o1, Food o2) {
        if (o1.getQuantity() > o2.getQuantity()) {
            return 1;
        }
        else {
            if (o1.getQuantity() < o2.getQuantity()) return -1;
        }
        return 0;
    }
}
