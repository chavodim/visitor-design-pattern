package PaymentExample;

import java.util.Optional;

public class PaymentJsonModel {

    private String name;

    private String action;

    private boolean startRecurrent;

    private Optional<String> transactionKey;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    public boolean isStartRecurrent() {
        return startRecurrent;
    }

    public void setStartRecurrent(boolean startRecurrent) {
        this.startRecurrent = startRecurrent;
    }


    public Optional<String> getTransactionKey() {
        return transactionKey;
    }

    public void setTransactionKey(Optional<String> transactionKey) {
        this.transactionKey = transactionKey;
    }

}
