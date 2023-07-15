public class Example {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("SOFTWARE ENGINEER");
        System.out.println("Salary : " + employee.salary());

        Employee employee2 = EmployeeFactory.getEmployee("PROJECT MANAGER");
        System.out.println("Salary : " + employee2.salary());
    }
}