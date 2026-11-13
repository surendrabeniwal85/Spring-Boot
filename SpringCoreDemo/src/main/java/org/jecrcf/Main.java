package org.jecrcf;

import org.jecrcf.payment.paymentService;
import org.jecrcuniversity.cartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main(){
        System.out.println("Hello");
//        org.jecrcf.OrderService obj = new org.jecrcf.OrderService();
//        obj.placeOrder();
//        org.jecrcf.payment.paymentService service = new org.jecrcf.payment.paymentService();
//        org.jecrcf.OrderService order = new org.jecrcf.OrderService(service);
//        order.placeOrder();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

//        System.out.println("--Added from External JAR--");
//        cartService carcs = new cartService();
//        carcs.addToCart();

//        paymentService payment = context.getBean(paymentService.class);
//        payment.pay();

//        //Use Case 1
//        User user = context.getBean(User.class);
//        System.out.println(user.getName());
//        System.out.println(user.getAge());
//        //Use Case 2
        cartService cart = context.getBean(cartService.class);
        cart.addToCart();
    }
}
