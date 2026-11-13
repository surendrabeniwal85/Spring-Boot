package org.jecrc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EventDetails {

    @Value("${event.name}")
    private String name;

    @Value("${event.category}")
    private String category;

    @Value("${event.venue}")
    private String venue;

    @Value("${event.date}")
    private String date;

    @Value("${event.organizer}")
    private String organizer;

    public String getName() {
        return name;
    }

    public String getVenue() {
        return venue;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void display() {
        System.out.println("Event Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Venue: " + venue);
        System.out.println("Event Date: " + date);
        System.out.println("Organizer: " + organizer);
    }
}
