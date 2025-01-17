class User {
    private final String userId;
    private final String userName;
    private final String email;

    private User(UserBuilder userBuilder) {
        // INITIALIZE
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.email = userBuilder.email;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return this.userId + " : " + this.userName + " : " + this.email;
    }

    // Inner class to create object
    static class UserBuilder {
        private String userId;
        private String userName;
        private String email;

        public UserBuilder() {

        }

        public static UserBuilder builder() {
            return new UserBuilder();
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }


    }
}