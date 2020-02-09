import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        switch (month){
            case 1 :
                System.out.println("Січень");
                break;
            case 2 :
                System.out.println("Лютий");
                break;
            case 3 :
                System.out.println("Березень");
                break;
            case 4 :
                System.out.println("Квітень");
                break;
            case 5 :
                System.out.println("Травень");
                break;
            case 6 :
                System.out.println("Червень");
                break;
                default:
                    System.out.println("Нет столько месяцей");
        }
    }
}
