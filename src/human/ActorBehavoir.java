package human;

public interface ActorBehavoir {

    boolean isMakeOrder(boolean isMade);
    boolean isTakeOrder(boolean isMade);
    void setMakeOrder(boolean isMade);
    void setTakeOrder(boolean isTake);
//    Order makeOrder(ArrayList<String> orderList);

}
