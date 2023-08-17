package Vending;

import java.util.ArrayList;

// Dependency Inversion Principle (Принцип инверсии зависимостей).
// Класс записит от более высокого класса напитки и дополняет его, при этом оба зависят от абстрактного продукта

public class HotBeverage extends Beverage implements AutomatServise<Automat, Product>{
    private double temperature; // температура
    ArrayList<Beverage> beverageArrayList = new ArrayList<>();

    public HotBeverage(String name, double price, int quantity, double volume, double temperature) {
        super(name, price, quantity, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public ArrayList<Beverage> getBeverageArrayList() {
        return beverageArrayList;
    }

    public void setBeverageArrayList(ArrayList<Beverage> beverageArrayList) {
        this.beverageArrayList = beverageArrayList;
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
    public Automat addProduct(Automat A, Product product) {
        A.setAddProduct(product);
        return A;
    }
}
