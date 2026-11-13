package com.jecrc;

import org.springframework.stereotype.Component;

//@Component
public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService)
    {
        this.paymentService = paymentService;
        System.out.println("Order Service Object Created...");
    }

//    public OrderService()
//    {
//        System.out.println("Order Service Object Created...");
//    }
    public void placeOrder()
    {
        paymentService.pay();
        System.out.println("Order Placed...");
    }
}
