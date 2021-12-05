package stage1;

/**
 * Created by sailesh on 12/5/21.
 */
public class OrderService {

    public void process() {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment();



//        EmailNotificationService notificationService =new EmailNotificationService();
//        notificationService.sendNotification();

        SmsNotificationService smsNotificationService = new SmsNotificationService();
        smsNotificationService.sendSmsNotification();


        ///10 more methods need to make changes ove all those

    }
}