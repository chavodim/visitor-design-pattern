package PaymentExample;

public interface PaymentTypeVisitor<T> {
    T visitIndividual(PaymentService individual);
    T visitParent(PaymentService parent);
    T visitChild(ChildPaymentService individual);
}
