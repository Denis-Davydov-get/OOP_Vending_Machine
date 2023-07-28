package Vending;

import java.util.Comparator;

public abstract class Beverage extends Product implements Comparator<Beverage> {
    double volume; // объем

    public Beverage(String name, double price, int quantity, double volume) {
        super(name, price, quantity);
        this.volume = volume;
    }

    public double getVolume() {return volume;}
    public void setVolume(double volume) {this.volume = volume;}

    @Override
    public String toString() {
        return "Vending.Beverage{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", volume=" + getVolume() +
                '}';
    }

    public abstract Comparator<Beverage> reversed();
}
