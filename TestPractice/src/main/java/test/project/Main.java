package test.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    static void main(){

        ApplicationContext context = SpringApplication.run(Main.class);
        HelloWorld obj = context.getBean(HelloWorld.class);
        obj.print();
    }
}
