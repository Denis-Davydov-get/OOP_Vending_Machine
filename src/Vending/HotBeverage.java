package Vending;

import java.util.Comparator;

public class HotBeverage extends Beverage {
    private double temperature; // температура
    public HotBeverage(String name, double price, int quantity, double volume, double temperature) {
        super(name, price, quantity, volume);
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return "Vending.HotDrink{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", volume=" + getVolume() +
                ", temperature=" + temperature +
                '}';
    }

    @Override
    public int compare(Product o1, Product o2) {
        return 0;
    }

    @Override
    public int compare(Beverage o1, Beverage o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public Comparator<Beverage> reversed() {
        return null;
    }

    public double getTemperature() {
        return temperature;
    }
}
