package method;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String myName = "Anna";
       int myAge = 27;
		sayHello();
         howAreYou(myName,myAge);
	}
	public static void sayHello() {
       System.out.println("Hello");
       }
	public static void howAreYou(String name, int age) {
		System.out.println("How are you: " + name + " " + age);
	} 
}
