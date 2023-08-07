package Vending;
import human.Human;
import human.Order;
import java.util.ArrayList;

public class Automat implements AutomatServise<Automat, Product>{
    private ArrayList<Product> productList;
    public void initProduct(ArrayList<Product> productList){this.productList=productList;}
    public ArrayList<Product> getListProduct() {return productList;}

    public Product getProduct(String name) {
        for (Product i : productList) {
                if (i.getName().equals(name)) {
                    return i;
                }
            }
        return null;
        }

    //  пройти по продуктам, проверить наличие (>0), "запомнить цену", если нет в наличии удалить из списка заказа
    public Order createOrder(ArrayList<Product> nameProductHuman, Human human){
        double sum=0;
        for (Product prod : nameProductHuman) {
            if(getProduct(prod.getName()).getQuantity()>0){
                sum+=getProduct(prod.getName()).getPrice();
            } else {
                nameProductHuman.remove(prod);
            }
        }
        Order order = new Order(nameProductHuman, human, sum);
        return order;
    }


    @Override
    public String toString() {
        return "Automat{" +
                "listProduct=" + productList +
                '}';
    }
    public Product getProduct(String name, double volume, int temperature) {
        for (Product product : productList) {
            if (product instanceof Food) {
                if(product.getName().equals(name) && (product).getPrice() == product.getPrice()&&(product).getQuantity()== product.getQuantity())
                    return  product;
            }
        }
        return null;
    }

    public void setAddProduct(Product addProduct) {productList.add(addProduct);
    }

    @Override
    public Automat addProduct(Automat A, Product product) {
         A.setAddProduct(product);
        return A;
    }
}
