class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void notified(String title) {
        System.out.println("Hello " + this.name + ", New video: " + title);
    }
}