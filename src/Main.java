import Vending.*;
import human.Human;
import human.Order;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> allProduct = new ArrayList<>();
        allProduct.add(new Food("Snikers",80,5,80));
        allProduct.add(new Food("Bounti",80,5,82));
        allProduct.add(new Food("Milky Way",59,5,52));
        allProduct.add(new Food("Mars",79,5,82));
        allProduct.add(new Food("Батончик Nuts",59,5,66));
        allProduct.add(new HotBeverage("Lipton", 30, 5, 0.2, 70));
        allProduct.add(new HotBeverage("BlackCart", 50, 5, 0.2, 70));

        Automat automatFood = new Automat(); // атомат с едой
        automatFood.initProduct(allProduct);
//        System.out.println(automatFood.getListProduct().toString());

        HotBeverageAutomat beverageAutomat = new HotBeverageAutomat(); // атомат с напитками
        beverageAutomat.initProduct(allProduct);
//        System.out.println(beverageAutomat.getListProductHotBeverage().toString());
        ArrayList<Product> orderListHuman = new ArrayList<>();
        orderListHuman.add(automatFood.getProduct("Snikers"));
        orderListHuman.add(automatFood.getProduct("Mars"));
        Human Denis = new Human("Denis", true, false, 500);
        Order order1 = automatFood.createOrder(orderListHuman);
        order1.setBuyer(Denis);
        System.out.println(order1);


    }
}