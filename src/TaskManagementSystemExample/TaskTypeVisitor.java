package TaskManagementSystemExample;

public interface TaskTypeVisitor<T extends Task> {

    Bug visitBug(BugProperties bug);
    Story visitStory(StoryProperties story);
    Feedback visitFeedback(FeedbackProperties feedback);
//    Project visitProject(ProjectProperties project);

}
