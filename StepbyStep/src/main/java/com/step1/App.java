package com.step1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");

        Alien obj1 = (Alien) context.getBean("alien");
        obj1.code();
        Calculator obj2 = (Calculator) context.getBean("calculator");
        obj2.cal();
        Laptop obj3 = (Laptop) context.getBean("lap");
    }
}

