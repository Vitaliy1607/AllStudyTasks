import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

//        try {
//            foo();
//        } catch (ArithmeticException e) {
//            System.err.println("Divide by zero");
//        }
//
//        try {
//            Object o = new ArrayList<>();
//            Random r = (Random) o;
//        } catch (ClassCastException e) {
//            e.printStackTrace();
//        }
        Calculator c = new Calculator();

        try {
            System.out.println(c.div(22, 0));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(c.div(0, 0));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        new Scanner(System.in).nextInt();

        System.out.println("end");
    }

    public static void foo() {
        int n = 22 / 0;
    }
}
