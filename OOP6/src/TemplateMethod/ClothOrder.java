package TemplateMethod;

public class ClothOrder extends OrderTemplate {
    @Override
    protected void confirmOrder() {
        System.out.println("Confirm order");
    }

    @Override
    protected void packOrder() {
        System.out.println("Pack cloth");
    }

    @Override
    protected void shipOrder() {
        System.out.println("Ship cloth");
    }
}