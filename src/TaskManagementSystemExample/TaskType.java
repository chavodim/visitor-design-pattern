package TaskManagementSystemExample;

public interface TaskType {

    <T extends Task> T accept(TaskTypeVisitor visitor);

}
