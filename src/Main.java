import Vending.*;
import human.Human;
import human.Order;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
//Создание и заполнение автомата с едой
        Automat automatFood = new Automat(); // автомат с едой
        ArrayList<Product> allFood = new ArrayList<>();
        Product potato = new Food("Картошка", 50, 3, 50);
        Product Snikers = new Food("Snikers", 80, 10, 80);
        Product Bounti = new Food("Bounti", 80, 9, 82);
        Product MilkyWay = new Food("Milky Way", 59, 8, 52);
        Product Mars = new Food("Mars", 79, 7, 82);
        Product Nuts = new Food("Батончик Nuts", 59, 3, 66);
        allFood.add(Snikers);
        allFood.add(Bounti);
        allFood.add(MilkyWay);
        allFood.add(Mars);
        allFood.add(Nuts);

//инициализация листа с продуктами
        automatFood.initProduct(allFood);
//автомат с напитками
        HotBeverageAutomat beverageAutomat = new HotBeverageAutomat();
        ArrayList<HotBeverage> hotBeverageArrayList = new ArrayList<>();
        HotBeverage Lipton = new HotBeverage("Lipton", 30, 10, 0.2, 70);
        HotBeverage BlackCart = new HotBeverage("BlackCart", 50, 8, 0.2, 70);
//вывод автоматов
//        System.out.println("Продукты в автомате с едой -" + automatFood.getListProduct().toString());
//        System.out.println("beverage - " + beverageAutomat.getListProduct().toString());
//Добавление любого продукта в автомат с продуктами
        AutomatServise automatServise = new AutomatService();
        automatServise.addProduct(automatFood, Lipton);
        automatFood.initProduct(allFood);
        System.out.println(allFood);
//список продуктов заказчика
        ArrayList<String> orderListHuman = new ArrayList<>();
        orderListHuman.add("Snikers");
        orderListHuman.add("Mars");
        orderListHuman.add("Картошка");
        orderListHuman.add("Lipton");
//Создание покупателя
        Human denis = new Human("Денис",500);
        denis.findNearestautomat();
//создание и вывод заказа
        Order denisOrder = denis.makeOrder(orderListHuman);
        System.out.println(denisOrder.toString());

//сортировка по количеству
//        hotBeverage.sort(new BeverageComparator());
//        System.out.println(hotBeverage);

//        allFood.sort(new FoodComparator());
//        System.out.println(allFood);

//        hotBeverage.sort(new HotBeverageComparator());
//        System.out.println(hotBeverage);



    }
}