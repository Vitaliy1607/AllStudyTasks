import java.util.ArrayList;
import java.util.List;


public class Program {

	public static void main(String[] args) {
//		Helm helm = new Helm("middle" , "ring");
//		Wheel wheel = new Wheel("titanDisk" , 16);
//		Body body = new Body("Sedan" , "zinkProtect");
//	    
//		Person person = new Person(helm, wheel, body);
//		person.getHelm().turnHelm();
//		person.getBody().paintBody();
//		person.rotate();
		List<Car> cars = new ArrayList<>(); 
		cars.add(new Car("Toyota","Chaser" , "black" , 2000));
		cars.add(new Car("Toyota","Celica" , "black" , 2000));
		cars.add(new Car("Nissan","Skyline" , "blue" , 2000));
	    System.out.println(cars.size());
	    cars.iterator();
	   
	}

}
