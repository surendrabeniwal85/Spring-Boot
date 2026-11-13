package com.example.demo1;

import org.springframework.stereotype.Component;

@Component
public class Base2 {

    private final Base3 b3;

    public Base2(Base3 b3) {
        this.b3 = b3;
    }

    public void display() {
        System.out.println("Hello from Base2");
        b3.print();
    }
}