package com.SpringBootTest2.jecrc;

public class Restaurant {
    private String name;
    private String location;

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void display() {
        System.out.println("Restaurant: " + name);
        System.out.println("Location: " + location);
    }
}
