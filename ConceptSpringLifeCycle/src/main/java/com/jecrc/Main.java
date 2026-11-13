package com.jecrc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        System.out.println("Hello");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();
//        String beanValue1 = context.getBean(String.class);
//        System.out.println(beanValue1);
//        int beanValue2 = context.getBean(int.class);
//        System.out.println(beanValue2);
//        AppConfig obj = context.getBean(AppConfig.class);
//        obj.demo();
//        CartService cart = context.getBean(CartService.class);
//        System.out.println(cart.getValue(1));
//        context.close();
    }
}
