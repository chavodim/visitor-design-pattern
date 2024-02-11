package TaskManagementSystemExample;

public class Bug implements Task, TaskType<Bug> {

    public BugProperties bugProperties;

    public Bug(BugProperties bugProperties) {
        this.bugProperties = bugProperties;
    }

    @Override
    public Bug accept(TaskTypeVisitor<Bug> visitor) {
        return visitor.visitBug(bugProperties);
    }
}
