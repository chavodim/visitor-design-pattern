package TaskManagementSystemExample;

public class Project implements Task, TaskVisitorToTaskType {

    ProjectProperties projectProperties;

    public Project(ProjectProperties projectProperties) {
        this.projectProperties = projectProperties;
    }

    public Project accept(TaskTypeVisitor visitor) {
        return visitor.visitProject(projectProperties);
    }
}
