package human;

public abstract class Actor implements ActorBehavoir {
    protected String name;
    protected boolean isMakeOrder = false; // делать заказ
    protected boolean isTakeOrder = false; // забрать заказ

    public Actor(String name) {
        this.name = name;

    }
}
