package Vending;
import human.Human;
import human.Order;
import java.util.ArrayList;
import java.util.List;

public class Automat {
    private List<Product> listProduct;

    public Automat() {}
    public void initProduct(List<Product> addListProduct) {
        this.listProduct = addListProduct;
    }
    public List<Product> getListProduct() {
        return listProduct;
    }



    public Product getProduct(String name) {
        for (Product i : listProduct) {
                if (i.getName().equals(name)) {
                    return i;
                }
            }
        return null;
        }

    //  пройти по продуктам, проверить наличие (>0), "запомнить цену"
    public Order createOrder(ArrayList<Product> listShopping){
        double price = 0;
        for (Product product:listShopping) {
            if(product.getQuantity() > 0){
                price += product.getPrice();
            }
        }

        return new Order(listShopping, price);
    }

    @Override
    public String toString() {
        return "Automat{" +
                "listProduct=" + listProduct +
                '}';
    }
}
