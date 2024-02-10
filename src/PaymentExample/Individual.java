package PaymentExample;

public class Individual implements PaymentType {

    private final PaymentService paymentService;

    public Individual(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public <T> T accept(PaymentTypeVisitor<T> visitor) {
        return visitor.visitIndividual(paymentService);
    }
}
