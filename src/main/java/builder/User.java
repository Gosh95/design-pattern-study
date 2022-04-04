package builder;

import lombok.Builder;

@Builder
public class User {
    private int age;
    private String name;
    private String email;

    public User() {}

//    public User(int age, String name, String email) {
//        this.age = age;
//        this.name = name;
//        this.email = email;
//    }
//
//    static class Builder {
//        private int age;
//        private String name;
//        private String email;
//
//        public Builder() {}
//
//        public Builder(User user) {
//            this.age = user.age;
//            this.name = user.name;
//            this.email = user.email;
//        }
//
//        public  Builder age(int age) {
//            this.age = age;
//            return this;
//        }
//
//        public Builder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public Builder email(String email) {
//            this.email = email;
//            return this;
//        }
//
//        public User build() {
//            return new User(age, name, email);
//        }
//    }
}