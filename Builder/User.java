public class User {
    public final String name;
    public final String email;
    public final Integer age;
    public final String gender;
    public final String phoneNumber;

    public User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.gender = builder.gender;
        this.phoneNumber = builder.phoneNumber;
    }

    public static class Builder {
        private String name;
        private String email;
        private Integer age;
        private String gender;
        private String phoneNumber;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email (String email) {
            this.email = email;
            return this;
        }

        public Builder age (Integer age) {
            this.age = age;
            return this;
        }

        public Builder gender (String gender) {
            this.gender = gender;
            return this;
        }

        public Builder phoneNumber (String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build () {
            return new User(this);
        }
    }
}