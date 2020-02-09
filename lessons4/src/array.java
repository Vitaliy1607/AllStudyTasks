import java.util.Arrays;
import java.util.Random;

public class array {
    public static void main(String[] args) {
        int[] arr = new int[9];
        arr[5] = 22;
        arr[3] = 18;
        System.out.println(arr[3]);
        System.out.println(arr[0]);
        System.out.println(arr[8]);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        Random rnd = new Random();
//        int num = rnd.nextInt(); // integer range
//        int num1 = rnd.nextInt() % 201; // -200 - 200
//        int num2 = rnd.nextInt(400); // 0-399
//        int num3= 100+ rnd.nextInt(200-100); // 100-199
//        for (int i = 0; i < arr.length;i++){
//            arr[i] = rnd.nextInt(8);
//        }
//        System.out.println(Arrays.toString(arr));
//        long sum = 0;
//        for (int i = 0 ; i < arr.length;i++ ){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//
//        int min = arr[0];
//        for (int i = 1; i < arr.length;i++){
//            if (min>arr[i]){
//               min = arr[1];
//            }
//        }
//        int[] indexes = new int[arr.length];
//        Arrays.fill(indexes, -1);
//        int j = 0;
//        for (int i = 0; i < arr.length;i++){        //потім нагадати
//            if (arr[i] == min){
//                indexes[j] = i;
//                j++;
//            }
//        }
//        int i = 0;
//        while (indexes[i] != -1){
//            System.out.println(indexes[i++]);
//        }
//        for (int i = 0; i < j; i++){
//            System.out.println(indexes[i]);
//        }

        int[] aa = {43, 34 , 44, 5 , 78 , 2};
        System.out.println(Arrays.toString(aa));

    }

}
