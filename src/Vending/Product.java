package Vending;
import java.util.ArrayList;



public abstract class Product {
    private String name; // название товара
    private double price; // цена товара
    private int quantity; // кол-вo


    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    ArrayList<Product> listProduct = new ArrayList<>();
    public void setListProduct(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }
    public void initProduct(ArrayList<Product> list){
        listProduct = list;
    }

    @Override
    public String toString() {
        return "Vending.Product{" +
                "name='" + name + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", listProduct=" + listProduct +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }
}
