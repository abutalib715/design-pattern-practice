class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("5345")
                .setUserName("Talib")
                .setEmail("mail@mail.ck")
                .build();

        System.out.println(user);


        User user2 = User.UserBuilder.builder()
                .setUserId("123")
                .setUserName("Hasan")
                .setEmail("hansan@mail.ck")
                .build();

        System.out.println(user2);
    }
}