public class ProjectManagerFactory extends AbstractEmployeeFactory {
    public Employee createEmployee(){
        return new ProjectManager();
    }
}