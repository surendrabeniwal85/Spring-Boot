package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Alien {

    private final Desktop dtp;
    private final Laptop lep;

    public Alien(Desktop dtp, Laptop lep) {
        this.dtp = dtp;
        this.lep = lep;
    }

    public void code() {
        System.out.println("Hello from Alien");

        dtp.code2();
        lep.code1();
    }
}
