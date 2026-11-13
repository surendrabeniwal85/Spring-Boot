package org.example;

public class exampleCallStack2 {

    static void methodC()
    {
        System.out.println("I am inside method C");
    }
    static void methodB()
    {
        methodC();
    }
    static void methodA()
    {
        methodB();
    }

    public static void main(String[] args){

        System.out.println("Progress Started");
        methodA();
        System.out.println("Progress Finshed");
    }
}
