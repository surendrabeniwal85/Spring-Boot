package com.firstproject.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {

//		SpringApplication.run(HelloApplication.class, args);
//		System.out.println("Hello");
//		helloController obj = new helloController();
//		obj.hello();
		ApplicationContext context = SpringApplication.run(HelloApplication.class);
		helloController obj = context.getBean(helloController.class);
		obj.hello();
		obj.bye();
	}
}
