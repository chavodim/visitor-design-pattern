package TaskManagementSystemExample;

public class Bug implements Task, TaskVisitorToTaskType<Bug> {

    public BugProperties bugProperties;

    public Bug(BugProperties bugProperties) {
        this.bugProperties = bugProperties;
    }

    @Override
    public Bug accept(TaskTypeVisitor visitor) {
        return visitor.visitBug(bugProperties);
    }
}
