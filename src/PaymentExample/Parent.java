package PaymentExample;

public class Parent implements PaymentType{

    private final PaymentService paymentService;

    public Parent(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public <T> T accept(PaymentTypeVisitor<T> visitor) {
        return visitor.visitParent(paymentService);
    }
}
