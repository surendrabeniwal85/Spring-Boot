package org.jecrcf.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier
//@Component("upi")
public class upiPayment implements paymentService {

    @Override
    public void pay()
    {
        System.out.println("Paid by UPI...");
    }
}
