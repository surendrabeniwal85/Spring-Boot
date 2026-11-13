package com.SpringBootTest3.jecrc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
    //2. Method 1 - Autowiring
//    @Value("${PaymentGateway.type:RazorPay}")
//    private String type;
//    @Value("${PaymentGateway.retry-count}")
//    private int retryCount;
//1. Method 1 - Constructor
//    public PaymentGateway(@Value("${PaymentGateway.type}") String type,
//                          @Value("${PaymentGateway.retry-count}") int retryCount)
//    {
//        this.type = type;
//        this.retryCount = retryCount;
//    }
    private PaymentProperty paymentProperty;
    public PaymentGateway(PaymentProperty paymentProperty)
    {
        this.paymentProperty = paymentProperty;
    }
    public String getType() {
        return paymentProperty.getType();
    }

//    public void setType(String type) {
//        this.type = type;
//    }

    public int getRetryCount() {
        return paymentProperty.getRetryCount();
    }

//    public void setRetryCount(int retryCount) {
//        this.retryCount = retryCount;
//    }
    public boolean isEnabled()
    {
        return paymentProperty.isEnabled();
    }
    public int getTimeout()
    {
        return paymentProperty.getTimeout();
    }
    public void print()
    {
        System.out.println("Payment Type: " + getType());
        System.out.println("Retry Count: " + getRetryCount());
        System.out.println("Enabled: " + isEnabled());
        System.out.println("TimeOut: " + getTimeout());
    }
}
