package Vending;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageAutomat<H> extends Automat {
    private ArrayList<H> hotBeverageArrayList = new ArrayList<>();
    public HotBeverageAutomat() {
    }
    public void initHotBeverage(ArrayList<H> productList){
        this.hotBeverageArrayList=productList;
    }
    public List<Product> getListProductHotBeverage() { // фильтрует лист продуктов только по напиткам
        ArrayList<Product> tempHotBeverage = new ArrayList<>();
        for (Product i : getListProduct()) {
            if(i instanceof HotBeverage){
                tempHotBeverage.add(i);
            }
        }
        return tempHotBeverage; // возвращает лист напитков, без еды
    }

    public Product getProduct(String name, double volume, int temperature) {
        for (H product : hotBeverageArrayList) {
            if (product instanceof HotBeverage) {
                if(((HotBeverage) product).getName().equals(getProduct(((HotBeverage) product).getName())))
                    return (Product) product;
            }
        }
        return null;
    }

    public ArrayList<HotBeverage> getHotBeverageArrayList() {
        return (ArrayList<HotBeverage>) hotBeverageArrayList;
    }

    public void setHotBeverageArrayList(ArrayList<HotBeverage> hotBeverageArrayList) {
        this.hotBeverageArrayList = (ArrayList<H>) hotBeverageArrayList;
    }

    @Override
    public String toString() {
        return "HotBeverageAutomat{" +
                "hotBeverageArrayList=" + (ArrayList<H>) hotBeverageArrayList +
                '}';
    }
}


