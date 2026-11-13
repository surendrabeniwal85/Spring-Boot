package com.jecrc;

import com.jecrc.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private PaymentService paymentService;

    //Constructor Injection
//    public OrderService(@Qualifier("upi") PaymentService paymentService)
//    {
//        this.paymentService = paymentService;
//    }

    //Setter Injection
    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder()
    {
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
