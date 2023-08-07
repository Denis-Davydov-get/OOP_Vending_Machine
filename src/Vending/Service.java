package Vending;

import java.util.ArrayList;

public class Service<A,P> implements AutomatServise<Automat, Product> {

    @Override
    public Automat addProduct(Automat automat, Product product) {
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
