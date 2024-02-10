package TaskManagementSystemExample;

public class Project implements Task, TaskType {

    ProjectProperties projectProperties;

    public Project(ProjectProperties projectProperties) {
        this.projectProperties = projectProperties;
    }

    public Project accept(TaskTypeVisitor visitor) {
        return visitor.visitProject(projectProperties);
    }
}
