package human;
import Vending.*;

import Vending.Automat;
import java.util.ArrayList;
import java.util.List;

public class Human extends Actor implements ActorBehavoir {
    private double money; // деньги
    private Automat nearestAutomat; // ближайший автомат

    public Human(String name, int quanlity, double money) {
        super(name);
        this.money = money;
    }

    public void findNearestautomat(){
        ArrayList<Food> allProduct = new ArrayList<>();
        Food Snikers = new Food("Snikers", 80, 5, 80);
        Food Bounti = new Food("Bounti", 80, 5, 82);
        Food MilkyWay = new Food("Milky Way", 59, 5, 52);
        Food Mars = new Food("Mars", 79, 5, 82);
        Food Nuts = new Food("Батончик Nuts", 59, 5, 66);
        allProduct.add(Snikers);
        allProduct.add(Bounti);
        allProduct.add(MilkyWay);
        allProduct.add(Mars);
        allProduct.add(Nuts);

        ArrayList<HotBeverage> hotBeverage = new ArrayList<>();
        HotBeverage Lipton = new HotBeverage("Lipton", 30, 5, 0.2, 70);
        HotBeverage BlackCart = new HotBeverage("BlackCart", 50, 5, 0.2, 70);
        hotBeverage.add(Lipton);
        hotBeverage.add(BlackCart);

        Automat automat = new Automat();
        automat.initFood(allProduct);
        this.nearestAutomat = automat;
    }
    // дописать объем и температуру

    public Order makeOrder(List<String> productHuman) {
        ArrayList<Food> shopingList = new ArrayList<>();
        Food nameProduct;
        for (String name: productHuman) {
            nameProduct = nearestAutomat.getProduct(name);
            if(nameProduct != null){
                shopingList.add(nameProduct);
            }
        }
        setMakeOrder(true);
        return nearestAutomat.createOrder(shopingList,this);
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
                ", nearestAutomat=" + nearestAutomat +
                ", name='" + name + '\'' +
                ", isMakeOrder=" + isMakeOrder +
                ", isTakeOrder=" + isTakeOrder +
                '}';
    }
}
