class GraphicDesignerFactory extends AbstractEmployeeFactory {
    public Employee createEmployee() {
        return new GraphicDesigner();
    }
}