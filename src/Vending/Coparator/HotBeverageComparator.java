package Vending.Coparator;
import Vending.HotBeverage;

import java.util.Comparator;

public class HotBeverageComparator implements Comparator<HotBeverage> {

    @Override
    public int compare(HotBeverage o1, HotBeverage o2) {
        if (o1.getQuantity()>o2.getQuantity()) {
            return 1;
        }
        else {
            if (o1.getQuantity()<o2.getQuantity()) return -1;
        }
        return 0;
    }
}