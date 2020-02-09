// Виведіть на екран всі члени послідовності 2an-1-1, де a = 2, які менше 10000

import java.util.Scanner;

public class cycle5 {
    public static void main(String[] args) {
//        int a = 2;
//        for (int n = 0;n<10000;n++){
//            int result = (2*a*n) -1 -1;
//            System.out.println(result);
//        }
        int a = 2;
        System.out.println("Enter value N - ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result;

        for (result = 0; result <= 10000; result = (2*a*n) -1 -1) {
            System.out.println(result);
            n++;
        }
    }
}
