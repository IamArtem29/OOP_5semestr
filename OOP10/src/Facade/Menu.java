package Facade;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<String, Integer> menuItems;

    public Menu() {
        menuItems = new HashMap<>();
        menuItems.put("Pasta", 10);
        menuItems.put("Salad", 5);
        menuItems.put("Burger", 15);
    }

    public void displayMenu() {
        System.out.println("Menu: ");
        for (String item : menuItems.keySet()) {
            System.out.println(item + " - " + menuItems.get(item));
        }
    }

    public boolean isValidItem(String dishName) {
        return menuItems.containsKey(dishName);
    }

    public double getPrice(String dishName) {
        return menuItems.getOrDefault(dishName, 0);
    }
}
