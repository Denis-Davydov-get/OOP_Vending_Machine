package Vending;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageAutomat extends Automat {
    ArrayList<HotBeverage> productList=new ArrayList<>();
    public HotBeverageAutomat() {
    }
    public void initProduct(ArrayList<HotBeverage> productList){
        this.productList=productList;
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
        for (Product product : productList) {
            if (product instanceof HotBeverage) {
                if(product.getName().equals(name) && ((HotBeverage) product).getTemperature() == temperature&&((HotBeverage) product).getVolume()==volume)
                    return  product;
            }
        }
        return null;
    }
}


