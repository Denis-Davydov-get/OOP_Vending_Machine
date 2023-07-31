import Vending.*;
import Vending.Coparator.BeverageComparator;
import Vending.Coparator.FoodComparator;
import Vending.Coparator.HotBeverageComparator;
import human.Human;
import human.Order;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        ArrayList<Food> allProduct = new ArrayList<>();
        Food Snikers = new Food("Snikers", 80, 10, 80);
        Food Bounti = new Food("Bounti", 80, 9, 82);
        Food MilkyWay = new Food("Milky Way", 59, 8, 52);
        Food Mars = new Food("Mars", 79, 7, 82);
        Food Nuts = new Food("Батончик Nuts", 59, 3, 66);
        allProduct.add(Snikers);
        allProduct.add(Bounti);
        allProduct.add(MilkyWay);
        allProduct.add(Mars);
        allProduct.add(Nuts);

        ArrayList<HotBeverage> hotBeverage = new ArrayList<>();
        HotBeverage Lipton = new HotBeverage("Lipton", 30, 10, 0.2, 70);
        HotBeverage BlackCart = new HotBeverage("BlackCart", 50, 8, 0.2, 70);
        hotBeverage.add(Lipton);
        hotBeverage.add(BlackCart);

        Automat automatFood = new Automat(); // атомат с едой
        automatFood.initFood(allProduct);
//        System.out.println("food -" + automatFood.getListProduct().toString());

        HotBeverageAutomat beverageAutomat = new HotBeverageAutomat(); // атомат с напитками
        beverageAutomat.initHotBeverage(hotBeverage);
//        System.out.println("beverage - " + beverageAutomat.getListProduct().toString());

        ArrayList<String> orderListHuman = new ArrayList<>(); //список продуктов заказчика
        orderListHuman.add("Lipton");
        orderListHuman.add("BlackCart");

        Human denis = new Human("Денис",500);
        denis.findNearestautomat();

        Order denisOrder = denis.makeOrder(orderListHuman);
//        System.out.println(denisOrder.toString());
        System.out.println();

        hotBeverage.sort(new BeverageComparator());
        System.out.println(hotBeverage);

        allProduct.sort(new FoodComparator());
        System.out.println(allProduct);

        hotBeverage.sort(new HotBeverageComparator());
        System.out.println(hotBeverage);

        System.out.println(denisOrder.compareTo(Mars));



    }


}