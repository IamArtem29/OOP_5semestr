package TemplateMethod;

public abstract class OrderTemplate {
    public void processOrder() {
        confirmOrder();
        packOrder();
        shipOrder();
    }

    protected abstract void confirmOrder();

    protected abstract void packOrder();

    protected abstract void shipOrder();
}