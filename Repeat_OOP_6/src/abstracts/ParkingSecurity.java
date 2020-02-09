
public class ParkingSecurity extends Worker {

	

	public ParkingSecurity(String name, int age, String gender, int salary, String role) {
		super(name, age, gender, salary, role);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println("Slepping");
	}

	@Override
	public void askSalary() {
		System.out.println("You earn" + getSalary());
	}

}
