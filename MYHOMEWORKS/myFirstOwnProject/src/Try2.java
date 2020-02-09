import java.util.Scanner;

public class Try2 {
    public static void main(String[] args) {
        Try2 start = new Try2();
        start.offerFirstPlayer();
        start.startGame();
        int[] line1 = {1 , 2 , 3};
        int[] line2 = {4 , 5 , 6};
        int[] line3 = {7 , 8 , 9};
        start.tableDesk(line1 , line2 , line3);



        }
    void startGame(){
        System.out.println("Игра началась");
    }
    void tableDesk(int[] line1, int[] line2, int[] line3){
        System.out.println(line1[0] + " " + line1[1] + " " + line1[2]);
        System.out.println(line2[0] + " " + line2[1] + " " + line2[2]);
        System.out.println(line3[0] + " " + line3[1] + " " + line3[2]);
    }
    void offerFirstPlayer(){
        System.out.println("Выберите чем будете играть:");
        System.out.println(" 1.Хрестики \n 2.Нолики" );
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a == 1){
            System.out.println("Вы выбрали Хрестики");
        }else {
            System.out.println("Вы выбрали Нолики");
        }
    }
}
