package Facade;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<String, Integer> orderItems;

    public Order() {
        orderItems = new HashMap<>();
    }

    public void addDish(String dishName) {
        if (orderItems.containsKey(dishName)) {
            orderItems.put(dishName, orderItems.get(dishName) + 1);
        } else {
            orderItems.put(dishName, 1);
        }
    }

    public Map<String, Integer> getOrderItems() {
        return orderItems;
    }
}
