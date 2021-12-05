package stage3;

/**
 * Created by sailesh on 12/1/21.
 */
public class DbPaymentRepository implements PaymentRepository{

    public void save() {
        System.out.println("Saved information to db");
    }
}
