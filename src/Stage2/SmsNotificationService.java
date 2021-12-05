package Stage2;

import Stage2.NotificationService;

/**
 * Created by sailesh on 12/5/21.
 */
public class SmsNotificationService implements NotificationService{

    public void sendNotification() {
        System.out.println("Sending sms notification");
    }

    @Override
    public void verifyNotification() {

    }
}
