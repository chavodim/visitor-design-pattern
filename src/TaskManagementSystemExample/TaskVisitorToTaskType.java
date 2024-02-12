package TaskManagementSystemExample;

public interface TaskVisitorToTaskType<T extends Task> {

    T accept(TaskTypeVisitor visitor);

}
