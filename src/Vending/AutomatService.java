package Vending;


import java.util.ArrayList;

public class AutomatService extends Service<Automat, Product> {
    public Automat restock(Automat automat, Product product) {
        Product addProduct = automat.getProduct(product.getName());
        ArrayList<Product> listProducts = automat.getListProduct();
        if (addProduct != null) {
            addProduct.setQuantity(addProduct.getQuantity() + product.getQuantity());
        } else {
            listProducts.add(product);
        }
        automat.initProduct(listProducts);
        return automat;
        }
    }

