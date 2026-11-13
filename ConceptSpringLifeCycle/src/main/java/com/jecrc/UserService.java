package com.jecrc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//Used to test Aware Interface
//@Component("userService")
public class UserService implements BeanNameAware, ApplicationContextAware {

    public UserService()
    {
        System.out.println("User Service Constructor Called");
    }

    //Bean Aware Print
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is: " + name);
    }

    //Application Context Aware Print
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Name is: " + applicationContext.getClass());
    }
}
