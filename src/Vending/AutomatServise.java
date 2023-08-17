package Vending;
// Interface Segregation Principle (Принцип разделения интерфейса).
// Сделали дополнительный интерфейс для добавления сущности продукта в сущность VM
// Здесь нарушается принцип т.к. нужно было сделать отдельный метод для каждого типа продукта, а не обобщать.
public interface AutomatServise <A, P> {
       A addProduct(Automat A, P product);
}
