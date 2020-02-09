import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> car = new ArrayList<>();
		car.add("Audi");
		car.add("BMW");
		car.add("VW");
		car.add(1, "Mercedes");
		System.out.println(car);
		System.out.println("Its a " + car.contains("bmw") + " , в масиве есть бмв");
	}

}
