import java.util.Scanner;

public class ForWithDekrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
          System.out.println("Введите слово");
          String slovo = scn.nextLine();
          for(int i = slovo.length()-1;i>=0;i--) {
           System.out.print(slovo.substring(i, i + 1));
	}

	}}
