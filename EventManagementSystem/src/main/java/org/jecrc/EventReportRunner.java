package org.jecrc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EventReportRunner implements ApplicationRunner {

    @Value("${spring.application.name}")
    private String appName;

    private final CollegeDetails college;
    private final EventDetails event;
    private final RegistrationDetails registration;

    public EventReportRunner(CollegeDetails college,
                             EventDetails event,
                             RegistrationDetails registration) {
        this.college = college;
        this.event = event;
        this.registration = registration;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("\n===== APPLICATION STARTUP REPORT =====");

        System.out.println("Application Name: " + appName);

        college.display();

        System.out.println();
        event.display();

        System.out.println();
        registration.display();

        System.out.println("=======================================\n");
    }
}
