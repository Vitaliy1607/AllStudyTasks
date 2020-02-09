package oop04;

import java.util.Random;

public class Program {
	
	public static void main(String[] args) {
		System.out.println(max(5,34));
		System.out.println(max(5.4 , 6.5));
        
		System.out.println(rand(-33, 20));
		System.out.println(rand(50));
	}
	
	public static int rand(int to) {
		return new Random().nextInt(to);
	}
	
	public static int rand(int from, int to) {
		return new Random().nextInt(to- from) + from;
	}
	
      static double max(double a , double b) {
    	  return a>b ? a : b;
      }
      
      static int max(int a , int b) {
    	  return a>b ? a : b;
      }
}
