package user;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Validator validator = new UserValidator();

        System.out.println("Enter email: ");
        String email = sc.next();

        System.out.println("Enter password: ");
        String password = sc.next();

        System.out.println("Enter phone number: ");
        String phoneNumber = sc.next();

        User user = new User(email, password, phoneNumber);

        try {
            if (validator.validate(user)) {
                System.out.println("user " + user + " saved to db");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
