package human;
import Vending.*;

import Vending.Automat;
import java.util.ArrayList;
import java.util.List;

public class Human extends Actor {
    private double money; // деньги
    private Automat nearestAutomat; // ближайший автомат
    public Human(String name, boolean makeOrder, boolean takeOrder, double money) {
        super(name, makeOrder, takeOrder);
        this.money = money;
    }
    public void findNearestautomat(){
        ArrayList<Product> allProduct = new ArrayList<>();
        allProduct.add(new Food("Snikers",80,5,80));
        allProduct.add(new Food("Bounti",80,5,82));
        allProduct.add(new Food("Milky Way",59,5,52));
        allProduct.add(new Food("Mars",79,5,82));
        allProduct.add(new Food("Батончик Nuts",59,5,66));
        allProduct.add(new HotBeverage("Lipton", 30, 5, 0.2, 70));
        allProduct.add(new HotBeverage("BlackCart", 50, 5, 0.2, 70));

        Automat automat = new Automat();
        automat.initProduct(allProduct);
        this.nearestAutomat = automat;
    }
    // дописать объем и температуру
    @Override
    public Order makeOrder(List<String> productHuman) { // проверяет список продуктов покупателя
        ArrayList<Product> listShopping = new ArrayList<>();
        Product shoppingProduct;
        for (String nameProduct: productHuman) {
            shoppingProduct = nearestAutomat.getProduct(nameProduct); // проверяет в ближайшем автомате наличие продкутов
            if(shoppingProduct != null){ // если такие продукты есть в ближайшем автомате кладет в список
                listShopping.add(shoppingProduct);
            }
        }
        isMakeOrder = true; // меняет флаг на "есть заказ"
        return nearestAutomat.createOrder(listShopping); //передает список продуктов для покупки для инициализации
    }
    public void setMoney(double money) {this.money = money;}
    @Override
    public boolean isMakeOrder() {return false;}

    @Override
    public boolean isTakeOrder() {
        return false;
    }

    @Override
    public Order makeOrder(ArrayList<Product> listProduct) {return null;}
    @Override
    public void setMakeOrder(boolean isMade) {}
    @Override
    public void setTakeOrder(boolean isTake) {}
    public double getMoney() {return money;}
    public Automat getNearestVM() {return nearestAutomat;}

}
