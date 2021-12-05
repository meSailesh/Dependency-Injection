package Stage2;

/**
 * Created by sailesh on 12/5/21.
 */
public class F1SoftPaymentService {

    public void processPayment() {
        System.out.println("Processing payment provided by customer");
        DbPaymentRepository dbPaymentRepository = new DbPaymentRepository();
        dbPaymentRepository.save();

    }
}
