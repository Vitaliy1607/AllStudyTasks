
public class Program {

	public static void main(String[] args) {
	Person person = new Person("Anton", 32, "Male", null);
		System.out.println(Person.getCount());
		
	
		final int ARRAY_SIZE = 47;
	 Person person1 = new Person("Ivan", 43, "Male", null);
//           System.out.println(person1);
//            person1.setName("Petro");
//           System.out.println(person1);
//		System.out.println(person1.getAddress());
//		person1.getAddress().setStreet("Pasicha");
//		System.out.println(person1.getAddress());
		
//		System.out.println(Person.getCount());
	 
	 Worker[] workers = new Worker[4];
	 workers[0] = new ParkingSecurity("Anton", 32, "Male" , null, 600 , "staff");
	 workers[1] = new ParkingSecurity("Ivan", 22, "Male" , null, 400 , "staff");
	 workers[2] = new Developer("Olya", 54, "Female" , null, 1200 , "staff");
	 workers[3] = new Developer("Misha", 34, "Male",null, 8000 , "staff");
	 
	 for (int i = 0; i < workers.length;i++) {
		 workers[i].work();
		 workers[i].askSalary();
		 
	 }
	}

}
