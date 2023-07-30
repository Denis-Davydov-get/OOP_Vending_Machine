package Vending;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Food extends Product {
    private double weight; // масса в граммах
    private final ArrayList<Product> listFood = getListProduct();


    public Food(String name, double price, int quantity, double weight) {
        super(name, price, quantity);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vending.Food{" +
                "weight=" + getWeight() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                '}';
    }

    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}

}
