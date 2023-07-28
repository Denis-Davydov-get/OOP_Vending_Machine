package Vending;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Food extends Product implements Comparator<Food>, Iterator<Food> {
    private double weight; // масса в граммах
    private int count;
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

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public int compare(Food o1, Food o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public Comparator<Food> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public boolean hasNext() {
        if (count<listFood.size()){
            return true;
        } else {
            return false;
        }
    }


    @Override
    public Food next() {
        if (hasNext()){
            count++;
            return (Food) listFood.get(count);
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
