
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Person person = new Person(33, "Ivan" , "Male" , 77.3);
          person.think("life");
   
          System.out.println(person.getAge());
          person.setAge(34);
          System.out.println(person.getAge());
                    
          Person person1 = new Person();
          System.out.println(person1.getAge());
//          person1.setAge(-223);
//          System.out.println(person1.getAge());
//          person1.think("car");
//          
//          Person person2 = new Person(20, "Ivan" , "Male" , 77.3);
//          System.out.println(person2.getAge());
	}

}
