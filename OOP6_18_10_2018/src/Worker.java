
public abstract class Worker extends Person {
	private int salary;
	private String role;
	
	

	public Worker(String name, int age, String gender, address address) {
		super(name, age, gender, address);
		}



	public Worker(String name, int age, String gender, address address, int salary, String role) {
		super(name, age, gender, null);
		this.salary = salary;
		this.role = role;
	}
	public abstract void work();
	
	public abstract void askSalary();



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "Worker [salary=" + salary + ", role=" + role + ", toString()=" + super.toString() + "]";
	}
	
	
	}
