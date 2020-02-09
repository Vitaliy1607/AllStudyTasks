import java.util.Scanner;

public class HrestikiNoliki {
    public static void main(String[] args) {
        HrestikiNoliki table = new HrestikiNoliki();
        int[] line1 = {1 , 2 , 3};
        int[] line2 = {4 , 5 , 6};
        int[] line3 = {7 , 8 , 9};

        char hrestik = 'X';
        char nolik = '0';
       int a, b ,c , d ,e ,f , g , h ,m;

        System.out.println("Выберите цифру для ввода(от 1 до 9)");
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
//        System.out.println("Игрок 1 ввёл цифру: " + a);
//        System.out.println("Игрок 2, выберите цифру");
//        b = scn.nextInt();
//        while (b == a){
//            System.out.println("Ето уже занято, выберите другую цифру");
//            b = scn.nextInt();
//        }
//        System.out.println("Игрок 1, выберите цифру");
//        c = scn.nextInt();
//        while ((c == b ) || (c == a)){
//            System.out.println("Ето уже занято, выберите другую цифру");
//            c = scn.nextInt();
//        }
//        d = scn.nextInt();
//        while ((d == a) || (d == b) || (d ==c ) ){
//            System.out.println();
//        }
    }

    void print(int[] line1, int[] line2, int[] line3) {
        System.out.println(line1[0] + " " + line1[1] + " " + line1[2]);
        System.out.println(line2[0] + " " + line2[1] + " " + line2[2]);
        System.out.println(line3[0] + " " + line3[1] + " " + line3[2]);
    }
}
