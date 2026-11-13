package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello");

//		Alien obj = new Alien();
//		obj.code();
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Alien obj = context.getBean(Alien.class);
		obj.code();
	}
}
