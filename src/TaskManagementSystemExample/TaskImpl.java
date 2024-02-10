package TaskManagementSystemExample;

public class TaskImpl {

    public static <E extends Task> E toTask(TaskType taskType){
        return taskType.accept(new TaskTypeToTaskVisitor());
    }

    public static class TaskTypeToTaskVisitor implements TaskTypeVisitor {

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
