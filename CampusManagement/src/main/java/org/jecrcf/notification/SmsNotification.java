package org.jecrcf.notification;

import org.jecrcf.student.Student;

public class SmsNotification implements NotificationService {

    @Override
    public void sendNotification(Student student) {

        System.out.println("Sending SMS to: " + student.getPhone());
    }
}