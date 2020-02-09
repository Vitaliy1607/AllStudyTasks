// Последовательность Фибоначчи(1 1 2 3 5 8 13 21)-нове число є сумою двох попередніх

public class Cycle8 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int s = 0;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 1; i<= 11; i++){

            if (i% 2 == 0){
                num1 = num1 + num2;

                System.out.println(num1);
            }else {
                num2 = num1+num2;
                System.out.println(num2);
            }
        }
    }
}
