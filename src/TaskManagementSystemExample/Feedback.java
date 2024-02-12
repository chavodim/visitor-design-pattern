package TaskManagementSystemExample;

public class Feedback implements Task, TaskVisitorToTaskType {

        FeedbackProperties feedbackProperties;

        public Feedback(FeedbackProperties feedbackProperties) {
            this.feedbackProperties = feedbackProperties;
        }

        @Override
        public Feedback accept(TaskTypeVisitor visitor) {
            return visitor.visitFeedback(feedbackProperties);
        }
}
