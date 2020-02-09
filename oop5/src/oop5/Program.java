package oop5;

public class Program {

	public static void main(String[] args) {
		Head head = new Head("brown");
		Body body = new Body ("L");
		Legs legs = new Legs();
	   Person person = new Person("Ivan", 22 , head , body , legs);
	   Person person1 = new Person("Petro", 25 , new Head("black", new Brain(100)) , new Body ("M") , new Legs());
//	   System.out.println(person1.getName().toUpperCase());
////	   person1.getLegs().run(person1.getName());
//	   person1.run();
	   
	   person1.think();
	   person1.getHead().think();
//	   
//	   Person p = new Person("Inna", 33);
//	   System.out.println(p.getHead().getHairColor());
//	   if(p.getHead() !=null) {
//		   p.getHead().getHairColor();
//	   }
//         p.run();
	}

}
