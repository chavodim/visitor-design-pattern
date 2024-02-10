import PaymentExample.*;

public class Main {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService("PaymentService", "Action");
        PaymentType parentPaymentType = new Parent(paymentService);
        PaymentJsonModel paymentJsonModel = PaymentTypeImpl.toJson(parentPaymentType);
    }
}