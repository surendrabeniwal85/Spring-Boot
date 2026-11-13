package com.SpringBootTest3.jecrc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JecrcApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JecrcApplication.class, args);
//        PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
        //1. Set values using Bean Object
//        paymentGateway.setType("PAYTM");
//        paymentGateway.setRetryCount(5);

        //2. Get values using Bean Object
//        System.out.println("Payment Type: " + paymentGateway.getType());
//        System.out.println("Retry Count: " + paymentGateway.getRetryCount());
        //3. Through Payment Properties
//        System.out.println("Payment Type: " + paymentGateway.getType());
//        System.out.println("Retry Count: " + paymentGateway.getRetryCount());
//        System.out.println("Enabled: " + paymentGateway.isEnabled());
//        System.out.println("TimeOut: " + paymentGateway.getTimeout());
//        paymentGateway.print();

    }
}
