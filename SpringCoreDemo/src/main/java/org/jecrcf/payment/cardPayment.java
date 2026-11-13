package org.jecrcf.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Qualifier
//@Component("cp")
public class cardPayment implements paymentService {

    @Override
    public void pay()
    {
        System.out.println("Paid by Card...");
    }
}
