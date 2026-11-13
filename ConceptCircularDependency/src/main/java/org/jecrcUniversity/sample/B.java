package org.jecrcUniversity.sample;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class B {

    private A a;
//    public B(A a)
//    {
//        this.a = a;
//    }
//    public B()
//    {
//        System.out.println("B Created");
////        this.a = new A();
//    }
//    public void showB()
//    {
//        System.out.println("Inside B");
//    }
    public B()
    {
        System.out.println("B Created");
//        this.a = new A();
    }
    public void showB()
    {
        System.out.println("Inside B");
    }
}
