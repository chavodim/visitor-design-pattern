package PaymentExample;

public class Child implements PaymentType {

    private final ChildPaymentService childPaymentService;

    public Child(ChildPaymentService childPaymentService) {
        this.childPaymentService = childPaymentService;
    }

    @Override
    public <T> T accept(PaymentTypeVisitor<T> visitor) {
        return visitor.visitChild(childPaymentService);
    }
}
