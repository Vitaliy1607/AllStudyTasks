import java.util.Scanner;

// Зробити підрахунок суми всіх чисел
public class SerefneArefmetuchne {

	public static void main(String[] args) { 
	        int sum = 0;
	        int num;
	        Scanner scn = new Scanner(System.in);
	        num = scn.nextInt();
	        while (num!=0){
	            sum+=num%10;
	            num/=10;
	        }
	        System.out.println(sum + " ");
	    }

}
	 
	
