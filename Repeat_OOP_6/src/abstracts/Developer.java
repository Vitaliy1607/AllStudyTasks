
public class Developer extends Worker {
	private boolean worked;
    public Developer(String name, int age, String gender, int salary, String role) {
		super(name, age, gender, salary, role);
		// TODO Auto-generated constructor stub
	}


	

	@Override
	public void work() {
		System.out.println(getName() + " is coding...");
		worked = true;
	}

	@Override
	public void askSalary() {
		    
			System.out.println("You earn" + getSalary());
		
		    
	}
		
	}
    

