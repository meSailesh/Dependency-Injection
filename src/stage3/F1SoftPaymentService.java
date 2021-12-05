package stage3;

/**
 * Created by sailesh on 12/1/21.
 */
public class F1SoftPaymentService implements PaymentService{
    private PaymentRepository paymentRepository;
        F1SoftPaymentService(PaymentRepository paymentRepository) {
            this.paymentRepository = paymentRepository;
        }

    public void process() {
        System.out.println("Processing the payment");
        paymentRepository.save();
    }
}
