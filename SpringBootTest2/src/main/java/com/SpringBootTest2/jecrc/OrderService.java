package com.SpringBootTest2.jecrc;

import java.util.List;
import java.util.Map;

public class OrderService {
    private Restaurant restaurant;
    private List<FoodItem> menu;
    private Order order;
    private Payment payment;

    public OrderService(Restaurant restaurant,
                        List<FoodItem> menu,
                        Order order,
                        Payment payment) {
        this.restaurant = restaurant;
        this.menu = menu;
        this.order = order;
        this.payment = payment;
    }

    public void placeOrder() {
        System.out.println("===== FOOD ORDERING SYSTEM =====");

        restaurant.display();

        System.out.println("\nAvailable Menu:");
        for (FoodItem item : menu) {
            System.out.println(item.getName()
                    + " - Rs. " + item.getPrice());
        }

        order.addItem(menu.get(0), 2);
        order.addItem(menu.get(1), 1);
        order.addItem(menu.get(2), 2);

        System.out.println("\nCustomer Details:");
        order.getCustomer().display();

        System.out.println("\nOrder Summary:");
        for (Map.Entry<FoodItem, Integer> entry
                : order.getItems().entrySet()) {
            FoodItem item = entry.getKey();
            int quantity = entry.getValue();

            System.out.println(item.getName()
                    + " x " + quantity
                    + " = Rs. "
                    + (item.getPrice() * quantity));
        }

        System.out.println("------------------------------");
        System.out.println("Total Bill: Rs. "
                + payment.calculateTotal(order));
        System.out.println("Order placed successfully!");
    }
}
