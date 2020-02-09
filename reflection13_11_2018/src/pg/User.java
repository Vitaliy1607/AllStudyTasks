package pg;

import Random.Random;
import pg.Email;

public class User {
    @Email
    private final String email;
    private String password;
    @Random()
    private int age;

    public User(String email, String password, int age) {
        this.email = email;
        this.password = password;
        this.age = age;
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
