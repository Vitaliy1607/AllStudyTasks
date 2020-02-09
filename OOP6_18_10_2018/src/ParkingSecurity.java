
public class ParkingSecurity extends Worker {

	
	
	public ParkingSecurity(String name, int age, String gender, address address, int salary, String role) {
		super(name, age, gender, address, salary, role);
		// TODO Auto-generated constructor stub
	}

	public void work() {
		System.out.println(getName() +" is Sleeping...");
	}
	
	public void askSalary() {
	System.out.println("you earn: " + getSalary());
		}
}
