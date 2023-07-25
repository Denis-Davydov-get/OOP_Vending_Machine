package Vending;

public class Food extends Product{
    public double weight; // масса в граммах
    public String name; // название товара
    public double price; //цена товара
    public int quantity; // кол-во товара

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
