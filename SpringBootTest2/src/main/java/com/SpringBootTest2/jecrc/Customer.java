package com.SpringBootTest2.jecrc;

public class Customer {
    private int id;
    private String name;
    private String address;

    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Address: " + address);
    }
}
