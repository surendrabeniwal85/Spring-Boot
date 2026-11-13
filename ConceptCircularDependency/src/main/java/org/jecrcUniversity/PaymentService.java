package org.jecrcUniversity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

//    @Autowired
//    private OrderService orderService;

//    public PaymentService(OrderService orderService)
//    {
//        this.orderService = orderService;
//    }
//    public void pay()
//    {
////        orderService.placeOrder();
//        System.out.println("Payment Done...");
//    }

    //Lazy initialization
    public PaymentService()
    {
        System.out.println("PaymentService Created");
//        this.orderService = new OrderService();
    }
    public void showPaymentService()
    {
        System.out.println("Inside PaymentService");
    }
}
