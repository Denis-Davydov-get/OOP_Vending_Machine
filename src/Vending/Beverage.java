package Vending;
// Single Responsibility Principle (Принцип единственной ответственности).
// Класс Beverage отвечает только за напитки в автомате

public class Beverage extends Product{
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


    public Automat addProduct(Automat automat, Product product) {
        automat.setAddProduct(product);
        return automat;
    }
}
