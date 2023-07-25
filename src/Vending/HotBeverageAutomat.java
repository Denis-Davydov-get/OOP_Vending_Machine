package Vending;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageAutomat extends Automat {
    public HotBeverageAutomat() {
    }
    public List<Product> getListProductHotBeverage() { // фильтрует лист продуктов только по напиткам
        ArrayList<Product> tempHotBeverage = new ArrayList<>();
        for (Product i : listProduct) {
            if(i instanceof HotBeverage){
                tempHotBeverage.add(i);
            }
        }
        return tempHotBeverage; // возвращает лист напитков, без еды
    }
    @Override
    public Product getProduct(String name) { // поиск горячего напитка по названию продукта
        Product temp = null;
        for (Product i : listProduct) {
            if (i instanceof HotBeverage) {
                if (i.getName().equals(name)) {
                    temp = i;
                }
            }
        }
        return temp;
    }
}


