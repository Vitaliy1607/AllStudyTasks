
public class Person {
	public static final int HEAD_COUNT;
	
	private static int count;
	
	 static {
	        System.out.println("doing some job");
	        count = 0;
	        HEAD_COUNT = 1;
	    }
	 
	private String name;
	private final int age;
	private final String gender;
	private final Adress address;
	
	public Person(String name, int age, String gender , Adress address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		count++;
	}
	
	public void sleep(int hours) {
		System.out.println(name + "is sleepping during" + hours + "h.");
	}
	
	public static int getCount() {
		return count;
	}
	
	public Adress getAddress() {
		return address;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}



	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

		
	
	
	
}
