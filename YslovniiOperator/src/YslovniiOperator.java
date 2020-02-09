import java.util.Scanner;

public class YslovniiOperator {

	public static void main(String[] args) {
		// 1-100 - Професори 
		// 101-300 - студенти
		// 301 - ... - персонал
      Scanner scn = new Scanner(System.in);
      System.out.println("Введите свой номер:");
      int id = scn.nextInt();
      double price = (id <= 100 && id > 301) ? 3.0 : 2.0;  // (умова) if істина else Ложь
     System.out.println("Цена для вас " + price); 
	}
	
}
