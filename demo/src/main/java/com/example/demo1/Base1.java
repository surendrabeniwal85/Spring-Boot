package com.example.demo1;

import org.springframework.stereotype.Component;

@Component
public class Base1 {

    private final Base2 b2;

    public Base1(Base2 b2) {
        this.b2 = b2;
    }

    public void show() {
        System.out.println("Hello from Base1");
        b2.display();
    }
}
