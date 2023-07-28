import Vending.*;
import human.Human;
import human.Order;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        ArrayList<Product> allProduct = new ArrayList<>();
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

        ArrayList<Product> hotBeverage = new ArrayList<>();
        HotBeverage Lipton = new HotBeverage("Lipton", 30, 5, 0.2, 70);
        HotBeverage BlackCart = new HotBeverage("BlackCart", 50, 5, 0.2, 70);
        hotBeverage.add(Lipton);
        hotBeverage.add(BlackCart);

        Automat automatFood = new Automat(); // атомат с едой
        automatFood.initProduct(allProduct);
//        System.out.println("food -" + automatFood.getListProduct().toString());

        HotBeverageAutomat beverageAutomat = new HotBeverageAutomat(); // атомат с напитками
        beverageAutomat.initProduct(hotBeverage);
//        System.out.println("beverage - " + beverageAutomat.getListProduct().toString());

        ArrayList<String> orderListHuman = new ArrayList<>(); //список продуктов заказчика
        orderListHuman.add("Lipton");
        orderListHuman.add("BlackCart");

        Human denis = new Human("Денис",500);
        denis.findNearestautomat();

        Order denisOrder = denis.makeOrder(orderListHuman);
//        System.out.println(denisOrder.toString());
        System.out.println();

    }
}