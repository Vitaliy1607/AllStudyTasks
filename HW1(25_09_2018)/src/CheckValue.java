import java.util.Scanner;

public class CheckValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше число");
        while (!sc.hasNextInt()){
            sc.next();
            System.err.println("Даное значение не является числом повторите попытку");
        }
        int num = sc.nextInt();
        if (num> 0){
            System.out.println("Дане число є додатнім");
        }else if (num == 0){
            System.out.println("Дане число є нулем");
        }else {
            System.out.println("Дане число є відємним");
        }
    }
}
