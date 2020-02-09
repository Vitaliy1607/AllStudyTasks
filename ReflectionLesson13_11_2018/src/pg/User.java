package pg;

public class User {
    @Email
    private final String email;
    private String password;
    @Random
    private int age;
    public String nickname;

    public User(String email, String password, int age, String nickname) {
        this.email = email;
        this.password = password;
        this.age = age;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
