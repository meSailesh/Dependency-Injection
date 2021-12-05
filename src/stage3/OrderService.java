package stage3;

/**
 * Created by sailesh on 12/1/21.
 */
public class OrderService {
    //payment process
    //send recipt
    private NotificationService notificationService;
    private PaymentService paymentService;

    OrderService (NotificationService notificationService, PaymentService paymentService) {
        this.notificationService = notificationService;
        this.paymentService = paymentService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    public void processOrder() {
        paymentService.process();
        notificationService.sendRecipt();

    }
}
