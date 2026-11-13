import Notification.Notification;
import org.springframework.stereotype.Component;

@Component
public class orderService {

    Notification notification;

    public orderService(Notification notification)
    {
        this.notification = notification;
    }

    public void orderNow()
    {
        notification.sendMessage();
        System.out.println("Order Created");
    }
}
