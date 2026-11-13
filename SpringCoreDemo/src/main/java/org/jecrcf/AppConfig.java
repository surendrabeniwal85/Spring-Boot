package org.jecrcf;

import org.jecrcf.payment.cardPayment;
import org.jecrcf.payment.paymentService;
import org.jecrcf.payment.upiPayment;
import org.jecrcuniversity.cartService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.jecrcf")
public class AppConfig {
    @Bean
    public User createUser()
    {
        return new User("Surendra Beniwal", 22);
    }
    @Bean
    public cartService createCartService()
    {
        return new cartService();
    }
//    @Primary
    @Qualifier("cp")
    @Bean
    public paymentService createPayment()
    {
        return new cardPayment();
    }
//    @Bean
//    public OrderService createOrderService(paymentService service)
//    {
//        return new OrderService(service);
//    }
    @Bean
    public OrderService createOrderService(@Qualifier("upi") paymentService service)
    {
//        OrderService order = new OrderService(service);
        return new OrderService(service);
    }
    @Bean
    @Qualifier("upi")
    public paymentService createUPIPayment()
    {
        return new upiPayment();
    }
}
