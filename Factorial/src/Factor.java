//Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.

//Примеры работы программы:

// числе 208 наибольшая цифра 8
//В числе 774 наибольшая цифра 7
//В числе 613 наибольшая цифра 6
import java.util.Random;
import java.util.Scanner;

public class Factor{
	public static void main(String[] args) {
		   Random rnd=new Random();
	        int a= (int)rnd.nextInt(899)+100;
	        int b=a%10;
	        int c=(a/10)%10;
	        int d=(a/100)%10;
	        if(b>=c&b>d||b>c&b>=d){
	            System.out.println("В числе "+a+" наибольшая цифра " +b);
	        }
	        else {
	            if (c>b&c>=d) {
	                System.out.println("В числе "+a+" наибольшая цифра " +c);
	            }
	            else {
	                System.out.println("В числе "+a+" наибольшая цифра " +d);
	            }
	        }
	}
}