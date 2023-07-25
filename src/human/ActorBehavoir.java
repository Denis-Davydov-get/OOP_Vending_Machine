package human;

import Vending.Product;

import java.util.ArrayList;

public interface ActorBehavoir {

    boolean isMakeOrder();
    boolean isTakeOrder();
    void setMakeOrder(boolean isMade);
    void setTakeOrder(boolean isTake);
    Order makeOrder(ArrayList<Product> orderList);
}
