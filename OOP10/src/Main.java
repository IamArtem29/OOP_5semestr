import Facade.RestaurantFacade;

public class Main {
    public static void main(String[] args) {
        RestaurantFacade restaurant = new RestaurantFacade();

        restaurant.displayMenu();
        restaurant.placeOrder("Pasta");
        restaurant.placeOrder("Burger");
        restaurant.payBill(25);
    }
}