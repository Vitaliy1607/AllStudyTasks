import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write your text: ");
        String string = s.nextLine(); // Задаєм змінній string значення
        System.out.println("You write: " + string);

    }
}
