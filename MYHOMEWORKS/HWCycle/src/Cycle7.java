// Виведіть на екран всі позитивні подільники натурального числа, введеного користувачем з клавіатури

import java.util.Scanner;

public class Cycle7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число");
        if (scn.hasNextInt()){
            int n = scn.nextInt();
            for (int i = 1; i<=n;i++){
                if (n%i == 0){
                    System.out.println(i + " ");
                }
            }
        }else {
            System.out.println("Ето не число");
        }
    }
}
