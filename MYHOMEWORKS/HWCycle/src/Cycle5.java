//Виведіть на екран всі члени послідовності 2an-1-1, де a = 2, які менше 10000.

public class Cycle5 {
    public static void main(String[] args) {
        int a = 2;
        for (int n = 0; n < 10000;n++){
            int res = 2*a*n - 1 - 1;
            if (res > 10000){
                break;
            }
            System.out.println(res);
        }
    }
}
