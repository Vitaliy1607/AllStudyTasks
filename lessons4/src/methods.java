import java.util.Random;

public class methods {
    public static void main(String[] args) {
        someMethod("ivan");
        someMethod("petro");
        someMethod("anna");
        someMethod("ira");
        System.out.println(mul(3, 5));
        System.out.println(mul(3, 5) / 10);
        int a = mul(44 , 55);
        System.out.println("a=" + a);
        int[] array = {5, 4, 3 , 8 ,9 ,2};
        printArr(array);
        fillArrWithRandomNumbers(array);
        printArr(array);
        printArr(new int[]{5, 4, 3 ,9 ,2});
    }
    static  void fillArrWithRandomNumbers(int[] arr){
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(200);
        }
    }

    static void someMethod(String name){
        System.out.println("Hello " + name);
    }                                          // Типи повернення
   static int mul(int a, int b){
      return a*b;
}

static void printArr(int[] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    System.out.println();
}
//static double pow(double base, int pow){
//        double res = 1;
//        boolean powPositive = pow>= 0 ? true : false; // якшо степінь більше 0
//        pow = powPositive? pow : -pow;
//        for(int i = 0; i < pow; i++){
//            res *= base;
//        }
//        return powPositive? res : 1 / res;
//}

    static double pow(double base, int pow) {
        double res = 1;
        boolean powPositive = pow >= 0 ? true : false; // якшо степінь більше 0
        pow = powPositive ? pow : -pow;
        for (int i = 0; i < pow; i++) {
            res *= base;
        }
        return powPositive ? res : 1 / res;
    }
}

