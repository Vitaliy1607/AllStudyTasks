package oop04;

public class Staff extends Worker {

	public Staff(String name, int age, int salary) {
		super(name, age, salary);
		
	}

	public void work() {
		 System.out.println(getName() + " is doing some staff...");
	}
}
