package human;
import java.util.List;

public abstract class Actor implements ActorBehavoir {
    protected String name;
    protected boolean isMakeOrder; // делать заказ
    protected boolean isTakeOrder; // забрать заказ

    public Actor(String name, boolean isMadeOrder, boolean isTakeOrder) {
        this.name = name;
        this.isMakeOrder = isMadeOrder;
        this.isTakeOrder = isTakeOrder;
    }
    public abstract Order makeOrder(List<String> product);
}
