package Stage2;

/**
 * Created by sailesh on 12/5/21.
 */
public class EmailNotificationService implements  NotificationService{
    public void sendNotification() {
        System.out.println("Sending notifiaction to the user through email");
    }

    @Override
    public void verifyNotification() {

    }

}
