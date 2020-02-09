package oop04;

public class Program2 {

	public static void main(String[] args) {
//		Person person = new Person("Anton", 33);
//		person.think();
//		System.out.println(person);
//		
		Worker worker = new Worker("Ihor", 44 , 2000);
//		worker.think();
//		worker.work();
//		System.out.println(worker);
//		
//		Person personNot = new Worker("Inna", 22 , 1000);
//		personNot.think();
//		System.out.println(personNot);
		
          Worker[] workers = {
        		  worker,
        		  new Developer("Ivan", 22, 1000),
        		  new Developer("Petro", 52, 1500),
        		  new Staff("Vasya", 25,800),
        		  new Worker("Anna", 25,900)
          };
          
          for(int i = 0; i < workers.length; i++) {
        	  workers[i].work();
        	  System.out.println("Good work, " + workers[i].getName() + " take your salary (" + workers[i].getSalary() + ")");
          }
	}

}
