package Vending;
import Vending.Iterator.BeverageAutomatIterator;
import human.Human;
import human.Order;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Automat implements Iterator<Product> {
    private List<Food> foodList;
    public Automat() {}

    public void initFood(List<Food> addListProduct) {
        this.foodList = addListProduct;
    }
    public List<Food> getListProduct() {
        return foodList;
    }

    public Food getProduct(String name) {
        for (Food i : foodList) {
                if (i.getName().equals(name)) {
                    return i;
                }
            }
        return null;
        }

    //  пройти по продуктам, проверить наличие (>0), "запомнить цену"
    public Order createOrder(ArrayList<Food> nameProductHuman, Human human){
        double sum=0;
        for (Product prod : nameProductHuman) {
            if(getProduct(prod.getName()).getQuantity()>0){
                sum+=getProduct(prod.getName()).getPrice();
            } else {
                nameProductHuman.remove(prod);
            }
        }

        Order order = new Order();
        order.setPrice(sum);
        order.setOrderList(nameProductHuman);
        order.setBuyer(human);

        return order;
    }
    public void initFood(ArrayList<Food> productList){
        this.foodList=productList;
    }

    @Override
    public String toString() {
        return "Automat{" +
                "listProduct=" + foodList +
                '}';
    }
    public Product getProduct(String name, double volume, int temperature) {
        for (Food product : foodList) {
            if (product instanceof Food) {
                if(product.getName().equals(name) && (product).getPrice() == product.getPrice()&&(product).getQuantity()== product.getQuantity())
                    return  product;
            }
        }
        return null;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Product next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
