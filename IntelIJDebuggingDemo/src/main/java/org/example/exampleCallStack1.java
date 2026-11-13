package org.example;

public class exampleCallStack1 {

    static void displayMessage()
    {
        System.out.println("Hello From displayMessage");
        System.out.println("Java Debugging");
    }

    public static void main(String[] args){
        System.out.println("Progress started");
        displayMessage();
        System.out.println("Progress Finished");
    }
}
