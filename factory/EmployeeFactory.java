public class EmployeeFactory {
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("SOFTWARE ENGINEER")) {
            return new SoftwareEngineer();
        } else if (empType.trim().equalsIgnoreCase("PROJECT MANAGER")) {
            return new ProjectManager();
        } else {
            return null;
        }
    }
}