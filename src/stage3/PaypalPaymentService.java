package stage3;

/**
 * Created by sailesh on 12/1/21.
 */
public class PaypalPaymentService implements  PaymentService{

    private PaymentRepository paymentRepository;
    PaypalPaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public void process() {
        System.out.println("Processing the payment");

        paymentRepository.save();

    }
}
