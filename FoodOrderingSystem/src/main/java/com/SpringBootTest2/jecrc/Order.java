package com.SpringBootTest2.jecrc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Order {
    private Customer customer;
    private Map<FoodItem, Integer> items = new LinkedHashMap<>();

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addItem(FoodItem item, int quantity) {
        items.put(item, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<FoodItem, Integer> getItems() {
        return items;
    }
}
