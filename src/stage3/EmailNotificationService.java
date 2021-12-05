package stage3;

/**
 * Created by sailesh on 12/1/21.
 */
public class EmailNotificationService implements NotificationService{

    @Override
    public void sendRecipt() {
        System.out.println("Sending receipt of purchase through email");

    }
}
