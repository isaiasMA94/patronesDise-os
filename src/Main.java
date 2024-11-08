import com.company.creational.Payment;
import com.company.creational.PaymentFactory;
import com.company.creational.TypePayment;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        probarFactoryMethod();
    }
    public static void probarFactoryMethod() {
        Payment payment= PaymentFactory.BuilderType(TypePayment.CARD);
        Payment payment2= PaymentFactory.BuilderType(TypePayment.GOOGLE_PAY);
        payment.doPayment();
        payment2.doPayment();
    }
}