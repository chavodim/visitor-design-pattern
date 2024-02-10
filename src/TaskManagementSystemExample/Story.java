package TaskManagementSystemExample;

public class Story implements Task, TaskType {

    StoryProperties storyProperties;

    public Story(StoryProperties storyProperties) {
        this.storyProperties = storyProperties;
    }

    public Story accept(TaskTypeVisitor visitor) {
        return visitor.visitStory(storyProperties);
    }
}
