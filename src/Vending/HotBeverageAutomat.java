package Vending;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageAutomat extends Automat {
    private ArrayList<HotBeverage> hotBeverageArrayList = new ArrayList<>();
    public HotBeverageAutomat() {
    }
    public void initHotBeverage(ArrayList<HotBeverage> productList){
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
        for (HotBeverage product : hotBeverageArrayList) {
            if (product instanceof HotBeverage) {
                if(product.getName().equals(name) && (product).getTemperature() == temperature&&(product).getVolume()==volume)
                    return  product;
            }
        }
        return null;
    }

    public ArrayList<HotBeverage> getHotBeverageArrayList() {
        return hotBeverageArrayList;
    }

    public void setHotBeverageArrayList(ArrayList<HotBeverage> hotBeverageArrayList) {
        this.hotBeverageArrayList = hotBeverageArrayList;
    }
}


