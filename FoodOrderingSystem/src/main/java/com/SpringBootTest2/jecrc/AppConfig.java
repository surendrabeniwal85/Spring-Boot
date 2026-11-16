package com.SpringBootTest2.jecrc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Customer customer() {
        return new Customer(101, "Surendra Beniwal", "Jaipur");
    }

    @Bean
    public Restaurant restaurant() {
        return new Restaurant("Domino's Pizza", "Jaipur");
    }

    @Bean
    public FoodItem pizza() {
        return new FoodItem("Pizza", 250);
    }

    @Bean
    public FoodItem burger() {
        return new FoodItem("Burger", 120);
    }

    @Bean
    public FoodItem coldCoffee() {
        return new FoodItem("Cold Coffee", 80);
    }

    @Bean
    public List<FoodItem> menu() {
        return Arrays.asList(pizza(), burger(), coldCoffee());
    }

    @Bean
    public Order order(Customer customer) {
        return new Order(customer);
    }

    @Bean
    public Payment payment() {
        return new Payment();
    }

    @Bean
    public OrderService orderService(
            Restaurant restaurant,
            List<FoodItem> menu,
            Order order,
            Payment payment) {
        return new OrderService(restaurant, menu, order, payment);
    }
}
