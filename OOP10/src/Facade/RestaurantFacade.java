package Facade;

public class RestaurantFacade {
    private Menu menu;
    private Order order;
    private Payment payment;

    public RestaurantFacade() {
        this.menu = new Menu();
        this.order = new Order();
        this.payment = new Payment();
    }

    public void displayMenu() {
        menu.displayMenu();
    }

    public void placeOrder(String dishName) {
        if (menu.isValidItem(dishName)) {
            order.addDish(dishName);
            System.out.println("Added : " + dishName);
        } else {
            System.out.println("Error, not in menu");
        }
    }

    public boolean payBill(Integer amount) {
        return payment.makePayment(order, menu, amount);
    }
}
