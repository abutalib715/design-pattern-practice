class Main {
    public static void main(String[] args) {
        UserManagement userManagegment = new UserManagement();
        userManagegment.addUser(new User("Talib", 1));
        userManagegment.addUser(new User("Akash", 2));
        userManagegment.addUser(new User("Sagor", 3));

        MyIterator myIterator = userManagegment.getIterator();
        while (myIterator.hasNext()) {
            User user = (User) myIterator.next();
            System.out.println(user.getName());
        }
    }
}