import java.util.Scanner;

// Створіть програму, що виводить на екран перші 20 елементів послідовності 2 4 8 16 32 64 128
public class cycle4 {
    public static void main(String[] args) {
//        for (int n = 2;n < 10000;n = n*2){
////            System.out.println(n);
////        }
        System.out.println("Enter value N ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a;

        for (a = n;a < 10000; a = a*2 ) {
            System.out.println(a);

        }
    }
}

