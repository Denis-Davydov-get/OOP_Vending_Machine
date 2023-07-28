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
    public Order createOrder(ArrayList<Product> nameProductHuman, Human human){
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

    @Override
    public String toString() {
        return "Automat{" +
                "listProduct=" + listProduct +
                '}';
    }
}
