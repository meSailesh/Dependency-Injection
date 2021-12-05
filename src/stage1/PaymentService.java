package stage1;

/**
 * Created by sailesh on 12/5/21.
 */
public class PaymentService {

    public void processPayment() {
        System.out.println("Processing payment provided by customer");
        PaymentRepository paymentRepository = new PaymentRepository();
        paymentRepository.save();

    }
}
