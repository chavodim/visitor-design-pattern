package TaskManagementSystemExample;

public class TaskImpl<E extends Task> {

    public E toTask(TaskVisitorToTaskType<E> taskType){
        return taskType.accept(new TaskTypeToTaskVisitor());
    }

    private static class TaskTypeToTaskVisitor implements TaskTypeVisitor {

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
