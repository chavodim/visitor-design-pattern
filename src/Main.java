import PaymentExample.*;
import TaskManagementSystemExample.*;

// Original code:https://github.com/ploeh/ChurchEncoding
// Article: https://blog.ploeh.dk/2018/06/25/visitor-as-a-sum-type/
public class Main {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService("PaymentService", "Action");
        PaymentType parentPaymentType = new Parent(paymentService);
        PaymentJsonModel paymentJsonModel = PaymentTypeImpl.toJson(parentPaymentType);

        //TODO - apply visitor pattern to TaskType
        //Change the Priority/Severity/BugStatus of the bug.
        //Change Priority/Size/StoryStatus of the story.
        //Change the Rating/FeedbackStatus of the feedback.
        BugProperties bugProperties = new BugProperties(
                new TaskProperties("BugTitle", "BugDescription"),
                Priority.HIGH
        );
        TaskType<Bug> bugType = new Bug(bugProperties);
        TaskImpl<Bug> taskImpl = new TaskImpl<>();
        Bug bug = taskImpl.toTask(bugType);
    }
}