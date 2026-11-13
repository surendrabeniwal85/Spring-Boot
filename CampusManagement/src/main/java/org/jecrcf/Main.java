package org.jecrcf;

import org.jecrcf.student.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EventRegistrationService service = context.getBean(EventRegistrationService.class);

        Student student = new Student(
                "Surendra Beniwal",
                "beniwalsurendra14@gmail.com",
                "9058274753"
        );

        service.registerStudent(student, "SIH 2026");

        ((AnnotationConfigApplicationContext) context).close();
    }
}

