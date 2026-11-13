package org.jecrcf;

import java.util.List;

import org.jecrcf.notification.NotificationService;
import org.jecrcf.student.Student;

public class EventRegistrationService {

    private List<NotificationService> notificationServices;

    public EventRegistrationService(
            List<NotificationService> notificationServices) {

        this.notificationServices = notificationServices;
    }

    public void registerStudent(Student student, String eventName) {

        System.out.println("Registering Student...");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Event Name: " + eventName);

        for (NotificationService service : notificationServices) {
            service.sendNotification(student);
        }

        System.out.println("Event Registration Completed...");
    }
}

