package Vending.Iterator;

import Vending.Automat;
import Vending.Food;
import java.util.Iterator;
import java.util.List;

public class FoodIterator implements Iterator<Food> {
    private int count = 0;
    Automat automat = new Automat();
    private final List<Food> productListIterator = automat.getFoodList();

    @Override
    public boolean hasNext() {
        if(productListIterator.size() > 0) return true;
        return false;
    }

    @Override
    public Food next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
