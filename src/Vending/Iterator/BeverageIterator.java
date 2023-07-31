package Vending.Iterator;

import Vending.Beverage;

import java.util.ArrayList;
import java.util.Iterator;

public class BeverageIterator implements Iterator<Beverage> {
    private int count = 0;
    ArrayList<Beverage> itertorBeverageList = new ArrayList<>();

    public BeverageIterator(ArrayList<Beverage> itertorBeverage) {
        this.itertorBeverageList = itertorBeverage;
    }

    @Override
    public boolean hasNext() {
        return count < itertorBeverageList.size();
    }

    @Override
    public Beverage next() {
        if(count < itertorBeverageList.size()) return itertorBeverageList.get(count++);
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
