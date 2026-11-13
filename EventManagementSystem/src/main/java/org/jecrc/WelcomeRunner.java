package org.jecrc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WelcomeRunner implements CommandLineRunner {

    private final CollegeDetails college;
    private final EventDetails event;
    private final RegistrationDetails registration;

    public WelcomeRunner(CollegeDetails college,
                         EventDetails event,
                         RegistrationDetails registration) {
        this.college = college;
        this.event = event;
        this.registration = registration;
    }

    @Override
    public void run(String... args) {
        System.out.println("\n===== WELCOME TO TECHFEST =====");
        System.out.println("Welcome to " + college.getName());
        System.out.println("Event: " + event.getName());
        System.out.println("Venue: " + event.getVenue());
        System.out.println("Registration: "
                + (registration.isEnabled() ? "Open" : "Closed"));
        System.out.println("================================\n");
    }
}
