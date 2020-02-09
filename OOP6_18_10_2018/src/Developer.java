
public class Developer extends Worker {
	public Developer(String name, int age, String gender, address address, int salary, String role) {
		super(name, age, gender, address, salary, role);
		// TODO Auto-generated constructor stub
	}

	private boolean worked;
	
	

	public void work() {
		System.out.println(getName() + " is coding...");
		worked = true;
	}
	
	public void askSalary() {
		if(worked) {
			System.out.println("You earn: " + getSalary() * 1.1);
		}
	}

}
