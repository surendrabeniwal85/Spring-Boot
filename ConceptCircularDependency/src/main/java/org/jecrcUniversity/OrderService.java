package org.jecrcUniversity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class OrderService {

    @Autowired
    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService)
//    {
//        this.paymentService = paymentService;
//    }
//    public void placeOrder()
//    {
//        paymentService.pay();
//        //End of circular dependency
//        getOrderService();
//        System.out.println("Order Placed");
//    }
//    public void getOrderService()
//    {
//        System.out.println("Order Details...");
//    }

    //Lazy Initialization
    public OrderService(@Lazy PaymentService paymentService)
    {
        this.paymentService = paymentService;
        System.out.println("lazyOrderService Created");
    }
    public void showOrderService()
    {
        System.out.println("Inside OrderService");
        paymentService.showPaymentService();
    }
}
