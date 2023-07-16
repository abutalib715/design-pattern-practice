public class SoftwareEngineerFactory extends AbstractEmployeeFactory {
    public Employee createEmployee(){
        return new SoftwareEngineer();
    }
}