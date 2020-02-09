package Part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	List<Car> cars = new ArrayList<>(); 
	
	cars.add(new Car("Audi a8", 2008, 4.2));
	cars.add(new Car("BMW i8", 2015, 2.2));
	cars.add(new Car("Mercedes CLS", 2000, 3.9));
	cars.add(new Car("VW Golf 3", 1990, 1.6));
	cars.add(new Car("Nissan  Almera ", 2005, 2.4));
	cars.add(new Car("BMW 3", 1998, 2.5));
   System.out.println(cars.contains("Audi a8"));
	
	
//	String make = scn.next().toLowerCase();
//	
//	List<Car> cars1 = new ArrayList<>();
//	for (Car car : cars) {
//		if(car.getName().toLowerCase().contains(make)) {
//			cars1.add(car);
//		}
//	}
//	System.out.println("Cars: ");
//	for (Car car : cars1) {
//		System.out.println(car);
//	}
	// менять год авто который ниже введеного числа
//	System.out.println("Введите год машины");
//	int year = scn.nextInt();
//	for (Car car : cars) {
//		if(car.getYear() <= year) {
//			System.out.println("Введите новый год");
//			car.setYear(scn.nextInt());
//		}
//	
//	}
//	
//	for (Car car : cars) {
//		System.out.println(car);
//	}
	
	// показувати машини в яких обєм двигуна менше 3л
//	List<Car> cars2 = new ArrayList<>();
//	System.out.println("Enter min value");
//	double volumeMin = scn.nextDouble();
//	System.out.println("enter max volume");
//	double volumeMax = scn.nextDouble();
//	for (Car car : cars) {
//		if(car.getVolume() <= volumeMax && car.getVolume() >=volumeMin)  {
//			cars2.add(car);
//		}
//	}
//	
//	System.out.println("This Cars stay in diap: ");
//	for (Car car : cars2) {
//		System.out.println(car);
//	}
	
	//ВИВОДИТИ МАШИНИ ПО ДІАПАЗОНУ РОКІВ ВИГОТОВЛЕННЯ
	List<Car> cars3 = new ArrayList<>();
	System.out.println("Enter minimal year of made");
	int yearMin = scn.nextInt();
	System.out.println("Enter maximal year of made");
	int yearMax = scn.nextInt();
	for (Car car : cars) {
		if(car.getYear()>=yearMin && car.getYear()<=yearMax) {
			cars3.add(car);
		}
	}
	
	System.out.println("Your diapason of year is: ");
	for (Car car : cars3) {
		System.out.println(car);
	}
 }  
	

	}

