package PaymentExample;
import PaymentExample.*;

import java.util.Optional;

public class PaymentTypeImpl {

    public static PaymentJsonModel toJson(PaymentType payment) {
        return payment.accept(new PaymentTypeToJsonVisitor());
    }

    private static class PaymentTypeToJsonVisitor implements PaymentTypeVisitor<PaymentJsonModel> {


        @Override
        public PaymentJsonModel visitIndividual(PaymentService individual) {
            PaymentJsonModel jsonModel =  new PaymentJsonModel();
            jsonModel.setName(individual.name());
            jsonModel.setAction(individual.action());
            jsonModel.setStartRecurrent(false);
            jsonModel.setTransactionKey(Optional.empty());
            return jsonModel;
        }

        @Override
        public PaymentJsonModel visitParent(PaymentService parent) {
            PaymentJsonModel jsonModel =  new PaymentJsonModel();
            jsonModel.setName(parent.name());
            jsonModel.setAction(parent.action());
            jsonModel.setStartRecurrent(true);
            jsonModel.setTransactionKey(Optional.empty());
            return jsonModel;
        }

        @Override
        public PaymentJsonModel visitChild(ChildPaymentService child) {
            PaymentJsonModel jsonModel =  new PaymentJsonModel();
            jsonModel.setName(child.paymentService().name());
            jsonModel.setAction(child.paymentService().action());
            jsonModel.setStartRecurrent(false);
            jsonModel.setTransactionKey(Optional.of(child.originalTransactionKey()));
            return jsonModel;
        }
    }
}
