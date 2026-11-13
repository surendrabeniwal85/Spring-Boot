import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import payment.PaymentService;

@Component
public class OrderService {

    //Field Injection
//    @Autowired
    private PaymentService paymentService;
    //IOC Implementation
    public OrderService(@Qualifier("upi") PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    public void placeOrder()
    {
        paymentService.pay();
        System.out.println("Order Placed...");
    }
}
