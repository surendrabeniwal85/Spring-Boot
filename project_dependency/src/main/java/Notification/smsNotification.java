package Notification;

import org.springframework.stereotype.Component;

@Component
public class smsNotification implements Notification {

    @Override
    public void sendMessage()
    {
        System.out.println("SMS Notification displayed");
    }
}
