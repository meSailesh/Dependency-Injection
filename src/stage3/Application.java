package stage3;

/**
 * Created by sailesh on 12/1/21.
 */
public class Application {
    public static void main(String[] args) {
        OrderService orderService = new OrderService(
                new EmailNotificationService(),
                new F1SoftPaymentService(
                        new DbPaymentRepository()));
        orderService.processOrder();

    }
}





