import java.util.Scanner;

public class OperatorIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mercedes = 2000;
		int audi = 3000;
		int vw = 5000;
		int price;
		Scanner scn = new Scanner(System.in);
		price = scn.nextInt();
		if(price == mercedes) {
System.out.println("You can buy mercedes");
	} else if(price == audi) {
		System.out.println("Ви купите Ауді");
		}
	else if(price >=vw) {System.out.println("Ви купите VW і все що захочете");}
     scn.close();
}
	}
