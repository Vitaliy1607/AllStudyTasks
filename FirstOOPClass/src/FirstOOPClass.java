
public class FirstOOPClass {

	public static void main(String[] args) {
      
		// Cтворити обєкт класу/типу "Box"
		Box myBox = new Box();
		myBox.width = 2; // "dot operator" (крапка)
		myBox.height =3;
		myBox.lenght =4;
		
		double volume = myBox.volume();
				System.out.println(volume);
				
	  Box myBox2 = new Box();
	  myBox2.width = 1; 
		myBox2.height =2;
		myBox2.lenght =3;
		System.out.println(myBox2.volume());
	}

}
