package human;

import Vending.Product;
import java.util.ArrayList;

public class Order <T extends Product>{
    private ArrayList<T> orderList;
    private Human buyer;
    private double price;

    public Order(ArrayList<T> orderList, Human buyer, double price) {
        this.orderList = orderList;
        this.buyer = buyer;
        this.price = price;
    }


    public double getPrice(double sum) {return price;}
    public void setPrice(double price) {this.price = price;}

    public ArrayList<T> getOrderList() {return orderList;}
    public void setOrderList(ArrayList<T> orderList) {this.orderList = orderList;}

    public Human getBuyer() {return buyer;}
    public void setBuyer(Human buyer) {this.buyer = buyer;}

    @Override
    public String toString() {
        return "Заказчик:"+ buyer.name +"\n" +
                "Список заказа: \n"+orderList+
                "\nCost:"+price;
    }


    public int compareTo(Product o) {
        if(o.getQuantity() > 0) return o.getQuantity();
        return 0;
    }
}
