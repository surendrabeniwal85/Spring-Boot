package Notification;

import org.springframework.stereotype.Component;

@Component
public class popupNotification implements Notification {

    @Override
    public void sendMessage()
    {
        System.out.println("Pop Up Notification displayed");
    }
}
