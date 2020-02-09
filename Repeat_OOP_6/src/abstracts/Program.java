
public class Program {
	public static void main(String[] args) {
		System.out.println(Person.getCount());
		Person person = new Person("Anton", 32 , "Male",null);
		
		Adress address = new Adress("Lviv" , "Franka");
		final int ARRAY_SIZE = 47;
		final Person person1 = new Person("Igor", 22, "Male" , address);
//		System.out.println(person1.getAddress());
//		person1.getAddress().setStreet("Pasichna");
//		System.out.println(person1.getAddress());
//		System.out.println(Math.ceil(5.5));
//		
//		System.out.println(Person.getCount());
		
		Worker[] workers = new Worker[4];
		workers[0] = new ParkingSecurity("Anna", 32, "Female", 1300, "JS");
		workers[1] = new ParkingSecurity("Petro", 23, "male", 1000, "JS");
		workers[2] = new Developer("Igor", 32, "Male", 800, "HR");
		workers[3] = new Developer("Ira", 32, "Female", 2000, "Head");
		for ( int i = 0; i < workers.length; i++) {
	   		 workers[i].work();
			 workers[i].askSalary();
		 }
	}
	 
}
