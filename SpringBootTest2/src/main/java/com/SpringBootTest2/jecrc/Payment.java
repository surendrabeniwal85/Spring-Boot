package com.SpringBootTest2.jecrc;

import java.util.Map;

public class Payment {

    public double calculateTotal(Order order) {
        double total = 0;

        for (Map.Entry<FoodItem, Integer> entry
                : order.getItems().entrySet()) {
            total += entry.getKey().getPrice()
                    * entry.getValue();
        }
        return total;
    }
}
