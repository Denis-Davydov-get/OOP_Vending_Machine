package Vending;

import java.util.ArrayList;

public class HotBeverageAutomatServise extends Service<HotBeverageAutomat, HotBeverage> {
        public HotBeverageAutomat restock(HotBeverageAutomat automat, HotBeverage product) {
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
