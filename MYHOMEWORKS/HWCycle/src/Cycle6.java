import java.util.Scanner;

// Створіть програму, яка обчислює факторіал натурального числа n, яке користувач введе з клавіатури.
public class Cycle6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n , f;
        f = 1;

        if (scn.hasNextInt()){
            n = scn.nextInt();
            for (int i = 1; i<=n;i++){
               int fact = f*i;
                System.out.println(fact);
            }
        }else {
            System.out.println("Петух...введи число");
        }

    }
}
