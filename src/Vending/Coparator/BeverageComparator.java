package Vending.Coparator;

import Vending.Beverage;
import java.util.Comparator;

public class BeverageComparator implements Comparator<Beverage> {

    @Override
    public int compare(Beverage o1, Beverage o2) {
        if (o1.getQuantity()>o2.getQuantity()) {
            return 1;
        }
        else {
            if (o1.getQuantity()<o2.getQuantity()) return -1;
        }
        return 0;
    }

}