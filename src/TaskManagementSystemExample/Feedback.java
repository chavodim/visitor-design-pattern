package TaskManagementSystemExample;

public class Feedback implements Task, TaskType{

        FeedbackProperties feedbackProperties;

        public Feedback(FeedbackProperties feedbackProperties) {
            this.feedbackProperties = feedbackProperties;
        }

        @Override
        public Feedback accept(TaskTypeVisitor visitor) {
            return visitor.visitFeedback(feedbackProperties);
        }
}
