package human;


import Vending.Product;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> orderList;
    private Human buyer;
    private double price;

    public Order(ArrayList<Product> listShopping, double price) {
    }

//    public Order(ArrayList<Product> orderList, double price) {  //конструктор принимает лист продкутов и цену
//        this.orderList = orderList;
//        this.price = price;
//    }

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public ArrayList<Product> getOrderList() {return orderList;}
    public void setOrderList(ArrayList<Product> orderList) {this.orderList = orderList;}
    public Human getBuyer() {return buyer;}
    public void setBuyer(Human buyer) {this.buyer = buyer;}

    @Override
    public String toString() {
        return "Order{" +
                "buyer=" + buyer +
                ",\n priceHuman=" + price +
                ",\n orderList=" + orderList+
                '}';
    }
}
