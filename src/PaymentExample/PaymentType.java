package PaymentExample;

public interface PaymentType {

    <T> T accept(PaymentTypeVisitor<T> visitor);
}
