package com.jecrc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jecrc")
public class AppConfig {
    //Method Declaration with bean
    @Bean
    public String createBean()
    {
        return "Hello from Bean";
    }
//    @Bean
//    public int newBean()
//    {
//        int a = 10;
//        int b = 5;
//        return (a + b);
//    }
    //Method Declaration without bean
//    public void demo()
//    {
//        System.out.println("Demo Return...");
//    }
    @Bean(initMethod = "start")
    public CartService getCartBean()
    {
        return new CartService();
    }
}
