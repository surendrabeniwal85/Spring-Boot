package com.jecrc.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
//@Qualifier("upi")
public class UPIPayment implements PaymentService {

    @Override
    public void pay()
    {
        System.out.println("Paid By UPI");
    }
}
