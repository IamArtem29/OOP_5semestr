package Facade;

import java.util.Map;

public class Payment {
    public boolean makePayment(Order order, Menu menu, Integer amount) {
        double totalAmount = 0.0;
        Map<String, Integer> orderItems = order.getOrderItems();

        for (Map.Entry<String, Integer> entry : orderItems.entrySet()) {
            String dishName = entry.getKey();
            int quantity = entry.getValue();
            double dishPrice = menu.getPrice(dishName);
            totalAmount += dishPrice * quantity;
        }

        if (totalAmount - amount == 0) {
            System.out.println("Done: " + amount);
            return true;
        } else {
            System.out.println("Error: incorrect payment");
            return false;
        }
    }
}
