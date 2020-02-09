package oop04;

public class Developer extends Worker {

	public Developer(String name, int age, int salary) {
		super(name, age, salary);
	
	}
	
 public void work() {
	 System.out.println(getName() + " is coding...");
 }
	
}
