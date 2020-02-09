import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int counter = 0;
     int newValue =0;
     int oldValue;
     System.out.println("Enter your Integer.");
     int number = scn.nextInt();
     while(number>=2) {
    	 System.err.println("Error.Try again");
    	 number = scn.nextInt();
     if(number==1) {
    	 newValue++;
     }
     }
   
     System.out.println("Standart Integer =" +counter);
     System.out.println("New Integer =" + newValue);
    
     
	}
}
