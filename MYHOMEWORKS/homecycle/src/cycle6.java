// Створіть програму, яка обчислює факторіал натурального числа n, яке користувач введе з клавіатури
import java.util.Scanner;

public class cycle6 {
    public static void main(String[] args) {
        System.out.println("Введи число для визначення факторіалу - ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int res = 1;
        for ( int i = 1; i <= n; i++ ) {
            res = res * i;
        }

        System.out.println(res);
    }

}






