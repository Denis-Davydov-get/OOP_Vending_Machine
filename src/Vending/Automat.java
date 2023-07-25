package Vending;
import human.Human;
import human.Order;
import java.util.ArrayList;
import java.util.List;

public class Automat {
    List<Product> listProduct;

    public Automat() {

    }
    public void initProduct(List<Product> addListProduct) {
        this.listProduct = addListProduct;
    }
    public List<Product> getListProduct() {
        return listProduct;
    }



    public Product getProduct(String name) { // поиск еды по названию продукта
        Product temp = null;
        for (Product i : listProduct) {
            if (i instanceof Food) {
                if (i.getName().equals(name)) {
                    temp = i;
                }
            }
        }
        return temp;

    }
    //  пройти по продуктам, проверить наличие (>0), "запомнить цену"
    public Order createOrder(ArrayList<Product> listShopping){
        double price = 0;

        for (Product product:listShopping) {
            if(product.getQuantity() > 0){
                price += product.getPrice();
            }
        }
        Order order = new Order(listShopping,price);
        return order;
    }

    @Override
    public String toString() {
        return "Automat{" +
                "listProduct=" + listProduct +
                '}';
    }
}
