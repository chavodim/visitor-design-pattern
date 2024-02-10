package PaymentExample;

public record ChildPaymentService(String originalTransactionKey, PaymentService paymentService) {
}