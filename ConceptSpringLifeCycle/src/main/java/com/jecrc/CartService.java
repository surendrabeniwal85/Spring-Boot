package com.jecrc;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

//Example of InitializingBean
//@Component
//public class CartService implements InitializingBean {
    public class CartService implements BeanNameAware, ApplicationContextAware {
    Map<Integer, String> mp;
    public CartService()
    {
        mp = new HashMap<>();
        System.out.println("Cart Service Constructor Created");
    }
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Initializing Callback");
//        mp.put(1, "Surendra Beniwal");
//        mp.put(2, "Naman Relia");
//    }

    public void start()
    {
        System.out.println("Now Bean is Ready");
        mp.put(1, "Surendra Beniwal");
        mp.put(2, "Naman");
        mp.put(3, "Ayush");
    }
    //Without Initializing the Bean
    @PostConstruct
    public void start2()
    {
        System.out.println("Now Bean is Ready");
        mp.put(1, "Surendra Beniwal");
        mp.put(2, "Naman");
        mp.put(3, "Ayush");
    }

    public void addToCart()
    {
        System.out.println("Added to Cart...");
    }
    //Check whether the map returns a value or not
    public String getValue(int key)
    {
        return mp.get(key);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Name is: " + applicationContext.getClass());
    }

//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Bean is Getting Destroyed");
//    }
}
