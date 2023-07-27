import Vending.*;
import human.Human;
import human.Order;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> allProduct = new ArrayList<>();
        for (Food food : Arrays.asList(
                new Food("Snikers", 80, 5, 80),
                new Food("Bounti", 80, 5, 82),
                new Food("Milky Way", 59, 5, 52),
                new Food("Mars", 79, 5, 82),
                new Food("Батончик Nuts", 59, 5, 66))) {
            allProduct.add(food);
        }
        ArrayList<Product> hotBeverage = new ArrayList<>();
        hotBeverage.add(new HotBeverage("Lipton", 30, 5, 0.2, 70));
        hotBeverage.add(new HotBeverage("BlackCart", 50, 5, 0.2, 70));

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
        denis.setNearestAutomat(automatFood);

        System.out.println(denis);

        Order denisOrder = denis.makeOrder(orderListHuman);

        System.out.println(denisOrder);










        //Comparable для сравнения order и Product
        //Comparator Order (validateOrder())

    }
}