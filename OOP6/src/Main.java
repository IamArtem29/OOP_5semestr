import TemplateMethod.BookOrder;
import TemplateMethod.ClothOrder;
import TemplateMethod.OrderTemplate;

public class Main {
    public static void main(String[] args) {
        OrderTemplate bookOrder = new BookOrder();
        OrderTemplate clothOrder = new ClothOrder();

        bookOrder.processOrder();
        clothOrder.processOrder();
    }
}