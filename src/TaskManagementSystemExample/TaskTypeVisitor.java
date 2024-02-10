package TaskManagementSystemExample;

public interface TaskTypeVisitor {

    Bug visitBug(BugProperties bug);
    Story visitStory(StoryProperties story);
    Feedback visitFeedback(FeedbackProperties feedback);
    Project visitProject(ProjectProperties project);

}
