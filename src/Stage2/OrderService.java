package Stage2;


/**
 * Created by sailesh on 12/5/21.
 */
public class OrderService {
    //Generic type
    //Generic implementation method
    //achieved using interface

    public void process() {
        PaymentService paymentService = new PaypalPaymentService();
        paymentService.processPayment();

        NotificationService notificationService = new EmailNotificationService();
        notificationService.sendNotification();


        notificationService.verifyNotification();

        ////10s of methods from notification service

    }
}