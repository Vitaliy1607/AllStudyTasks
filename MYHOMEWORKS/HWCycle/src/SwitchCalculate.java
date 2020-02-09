import java.util.Scanner;

public class SwitchCalculate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Выберите операцию");
        System.out.println("1.Plus(+)");
        System.out.println("2.Subtract(-)");
        System.out.println("3.Multiple(*)");
        System.out.println("4.Divide(/)");
        int operation = scn.nextInt();
        int res;
        System.out.println("Введите первое число: ");
        int a = scn.nextInt();
        System.out.println("Введите Второе число: ");
        int b = scn.nextInt();
        switch (operation){
            case 1:
                res = a + b;
                System.out.println(res);
                break;
            case 2:
                res = a - b;
                System.out.println(res);
                break;
            case 3:
                res = a * b;
                System.out.println(res);
                break;
            case 4:
                res = a / b;
                System.out.println(res);
                break;
                default:
                    System.err.println("Введите корректную операцию");
                    break;
        }

    }
}
