package oop04;

public class Worker extends Person {
   private int salary;

public Worker(String name, int age, int salary) {
	super(name, age);
	this.salary = salary;
}
  @Override  // override - переоприділення метода
     public void think() {
           	System.out.println(getName() + " is thinking about work");
   }
  
  public void work() {
	  System.out.println(getName() + " is working...");
  }
  @Override
	public String toString() {
		return super.toString() + ", salary $" + salary;
	}
public int getSalary() {
	return salary;
}
     
}
