package org.jecrcUniversity.sample;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class A {
    private B b;
    //Initialization of circular dependency
//    public A(B b)
//    {
//        this.b = b;
//    }
//    public A()
//    {
//        System.out.println("A Created...");
//        this.b = new B();
//    }
    //Implementation of lazy
//    public A(@Lazy B b)
//    {
//        this.b = b;
//        System.out.println("lazyA Created");
//    }
//    public void showA()
//    {
//        System.out.println("Inside A");
//        b.showB();
//    }
    //Eager initialization
    public A()
    {
//        this.b = b;
        System.out.println("Eager A Created");
    }
    public void showA()
    {
        System.out.println("Inside A");
//        b.showB();
    }

}
