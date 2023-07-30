package Vending;

import java.util.Comparator;
import java.util.Iterator;

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


    public double getTemperature() {
        return temperature;
    }


}
