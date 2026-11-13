package org.jecrcf;

import org.jecrcf.payment.paymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {
    //Field Injection method
//    @Autowired
    private paymentService service;
    public OrderService(paymentService service)
    {
        this.service = service;
    }

     //Constructor Injection
//    @Autowired
//    public OrderService(paymentService service)
//    {
//        this.service = service;
//    }

      //Setter injection method
    @Autowired
    public void setService(@Qualifier("upi") paymentService service){
        this.service = service;
    }

    public void placeOrder()
    {
        service.pay();
        System.out.println("Order Placed...");
    }
}
