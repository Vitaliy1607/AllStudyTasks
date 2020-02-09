import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
// у пользователя есть 3 попытки. После трех ответов программа должна завершиться;
//если пользователь вводит "Троллейбус", мы выводим в консоль "Правильно!" и выходим из цикла;
//если пользователь вводит "Сдаюсь", мы выводим в консоль "Правильный ответ: троллейбус." и выходим из цикла;
//если пользователь вводит любой другой ответ, мы выводим в консоль "Подумай еще." и продолжаем цикл.
public class les {
    public static void main(String[] args) {
        int[] arr = new int[9];
        arr [3] =2;
        arr[1] =22;
        System.out.print(Arrays.toString(arr));
        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        Random rnd = new Random();
        int num = rnd.nextInt(200);
        for (int i = 0;i< arr.length;i++){
            arr[i]= rnd.nextInt(8);
        }

        System.out.print(Arrays.toString(arr));
        long sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum +=arr[i];
        }
        System.out.println(sum);

        int min = arr[0];
        for (int i = 1;i< arr.length;i++){
            if (min > arr[i]){
                min= arr[i];
            }
        }
        for (int i = 1;i< arr.length;i++){
            if ( arr[i]== min ){
                System.out.println(i);
            }
        }
    }
}


