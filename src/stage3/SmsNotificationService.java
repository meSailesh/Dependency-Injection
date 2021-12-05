package stage3;

/**
 * Created by sailesh on 12/1/21.
 */
public class SmsNotificationService implements NotificationService{

    public void connectExternalService() {
        System.out.println("Making connection to the external sms vendor");
    }

    @Override
    public void sendRecipt() {
        System.out.println("Sending the user receipt through sms");
    }
}
