
public class Cabriolet extends Car {
	
	boolean roofOpened;
	
	
	public Cabriolet() {
		super();
	}

	 public void roofOpened() {
		 roofOpened = true;
	 }
	 
	 public void closeRoof() {
		 roofOpened = false;
	 }
}
