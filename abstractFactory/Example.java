public class Example {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new ProjectManagerFactory());
        System.out.println("Name : " + employee.name());
        System.out.println("Salary : " + employee.salary());

        Employee employee2 = EmployeeFactory.getEmployee(new SoftwareEngineerFactory());
        System.out.println("Name : " + employee2.name());
        System.out.println("Salary : " + employee2.salary());

        Employee employee3 = EmployeeFactory.getEmployee(new GraphicDesignerFactory());
        System.out.println("Name : " + employee3.name());
        System.out.println("Salary : " + employee3.salary());
    }
}