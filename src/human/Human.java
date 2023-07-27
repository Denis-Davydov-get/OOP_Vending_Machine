package human;
import Vending.*;

import Vending.Automat;
import java.util.ArrayList;
import java.util.List;

public class Human extends Actor implements ActorBehavoir {
    private double money; // деньги
    private Automat nearestAutomat; // ближайший автомат

    public Human(String name, double money) {
        super(name);
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
        return nearestAutomat.createOrder(shopingList);
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
    public Order makeOrder(ArrayList<String> listOrderHuman) { // makeOrder true
        ArrayList<Product> shoppingList = new ArrayList<>();
        Product shopProduct;
        for (String nameProduct : listOrderHuman) {
            shopProduct=nearestAutomat.getProduct(nameProduct);
            if (shopProduct != null){
                shoppingList.add(shopProduct);
            }
        }
        setMakeOrder(true);
        return nearestAutomat.createOrder(shoppingList);
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
