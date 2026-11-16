package org.jecrcf.notification;

import org.jecrcf.student.Student;

public class EmailNotification implements NotificationService {

    @Override
    public void sendNotification(Student student) {

        System.out.println("Sending Email to: " + student.getEmail());
    }
}