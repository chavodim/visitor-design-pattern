package TaskManagementSystemExample;

public class TaskImpl<E extends Task> {

    public E toTask(TaskType<E> taskType){
        return taskType.accept(new TaskTypeToTaskVisitor());
    }

    public class TaskTypeToTaskVisitor implements TaskTypeVisitor<E> {

        @Override
        public Bug visitBug(BugProperties bugProperties) {
            return new Bug(bugProperties);
        }

        @Override
        public Story visitStory(StoryProperties storyProperties) {
            return new Story(storyProperties);
        }

        @Override
        public Feedback visitFeedback(FeedbackProperties feedbackProperties) {
            return new Feedback(feedbackProperties);
        }
    }
}
