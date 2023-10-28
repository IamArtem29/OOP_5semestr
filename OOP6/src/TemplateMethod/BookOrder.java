package TemplateMethod;

public class BookOrder extends OrderTemplate {
    @Override
    protected void confirmOrder() {
        System.out.println("Confirm order");
    }

    @Override
    protected void packOrder() {
        System.out.println("Pack book");
    }

    @Override
    protected void shipOrder() {
        System.out.println("Ship book");
    }
}
