import java.util.Scanner;


public class Training {
	public static void main(String[] args) {
		int count = 10;
//		for (int i = 0; i <= count; i++) {    // Зовнішній цикл і виконується по вертикалі
//		    for (int j = 0; j < count-i; j++) { // внутрішній цикл - по горизонталі
//		        System.out.print(" * ");
//		    }
//		  
//		    System.out.println();
//		}
		int a = 1;
		for (int i = 0; i <= 10; i++) {    // Зовнішній цикл і виконується по вертикалі
		    for (int j = 0; j < a+i; j++) { // внутрішній цикл - по горизонталі
		        System.out.print(" * ");
		    }
		  
		    System.out.println();
		}
	}
	
}
	
