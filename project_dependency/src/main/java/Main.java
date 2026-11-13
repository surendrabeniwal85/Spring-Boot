import Notification.Notification;
import Notification.emailNotification;
import Notification.popupNotification;
import Notification.smsNotification;
import org.springframework.context.ApplicationContext;

public class Main {
    static void main()
    {
        System.out.println("Hello");
//        orderService obj1 = new orderService();
//        obj1.orderNow();

        Notification notification = new emailNotification();
        orderService obj = new orderService(notification);
        obj.orderNow();
    }
}
