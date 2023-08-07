package human;
import Vending.*;

import Vending.Automat;
import java.util.ArrayList;
import java.util.List;

public class Human<H> extends Actor implements ActorBehavoir {
    private double money; // деньги
    private Automat nearestAutomat; // ближайший автомат

    public Human(String name, double money) {
        super(name);
        this.money = money;
    }

    public void findNearestautomat(){
        ArrayList<Product> allProduct = new ArrayList<>();
        allProduct.add(new Food("Snikers", 80, 10, 80));
        allProduct.add(new Food("Bounti", 80, 9, 82));
        allProduct.add(new Food("Milky Way", 59, 8, 52));
        allProduct.add(new Food("Mars", 79, 7, 82));
        allProduct.add(new Food("Батончик Nuts", 59, 3, 66));
        allProduct.add(new Food("Картошка", 50, 3, 50));

        ArrayList<HotBeverage> hotBeverageArrayList = new ArrayList<>();
        hotBeverageArrayList.add(new HotBeverage("Lipton", 30, 10, 0.2, 70));
        hotBeverageArrayList.add(new HotBeverage("BlackCart", 50, 8, 0.2, 70));

        Automat automat = new Automat();
        automat.initProduct(allProduct);
        this.nearestAutomat = automat;
    }

    public Order makeOrder(List<String> productHuman) {
        ArrayList<Product> shopingList = new ArrayList<>();
        Product nameProduct;
        for (String name: productHuman) {
            nameProduct = nearestAutomat.getProduct(name);
            if(nameProduct != null){
                shopingList.add(nameProduct);
            }
        }
        setMakeOrder(true);
        return nearestAutomat.createOrder(shopingList, this);
    }
    public void setMoney(double money) {this.money = money;}
    public Automat getNearestAutomat() {return nearestAutomat;}
    public void setNearestAutomat(Automat nearestAutomat) {
        this.nearestAutomat = nearestAutomat;
    }
    public boolean isMakeOrder(boolean isMake) {return false;}
    public boolean isTakeOrder(boolean isTake) {
        return false;
    }
    @Override
    public void setMakeOrder(boolean isMade) {}
    @Override
    public void setTakeOrder(boolean isTake) {}
    public double getMoney() {return money;}
    public Automat getNearestVM() {return nearestAutomat;}

    @Override
    public String toString() {
        return "Human{" +
                "money=" + money +
                ", Ближайший автомат >=" + nearestAutomat +
                ", Имя заказчика='" + name + '\'' +
                ", isMakeOrder=" + isMakeOrder +
                ", isTakeOrder=" + isTakeOrder +
                '}';
    }
}
