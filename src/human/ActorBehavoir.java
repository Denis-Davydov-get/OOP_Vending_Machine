package human;
// Open-Closed Principle (Принцип открытости-закрытости).
// мы можем изменять статусы заказа, но не можем добавлять новые статусы.
public interface ActorBehavoir {

    boolean isMakeOrder(boolean isMade);
    boolean isTakeOrder(boolean isMade);
    void setMakeOrder(boolean isMade);
    void setTakeOrder(boolean isTake);
//    Order makeOrder(ArrayList<String> orderList);

}
