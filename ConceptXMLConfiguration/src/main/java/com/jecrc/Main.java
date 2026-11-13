package com.jecrc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main() {

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // 1. get Bean by Type
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();
        //2. get Bean by ID
//        OrderService order2 = context.getBean("orderService1", OrderService.class);
//        order2.placeOrder();
//        PaymentService paymentService = context.getBean(PaymentService.class);
//        paymentService.pay();
        //3. Call by Name attribute
//        OrderService order2 = context.getBean("orderServiceBean1", OrderService.class);
//        order2.placeOrder();
//        PaymentService paymentService = context.getBean(PaymentService.class);
//        paymentService.pay();
        //4. Dependency Injection by XML  //Calling by both
        OrderService order = context.getBean("orderService", OrderService.class);
        order.placeOrder();
    }
}
