package builder;

public class Main {
    public static void main(String[] args) {
        int age = 10;
        String name = "kim";
        String email = "abc123@google.com";

        User user = User.builder()
                            .age(age)
                            .name(name)
                            .email(email)
                            .build();
    }
}