
public class Program {

	public static void main(String[] args) {
			 
				Car car = new Car("Audi", "A5", 2012);
				 car.printPosition();
				 car.setDirection(45);
				 car.moveForward(30);
				 car.printPosition();
	
				 
				 Cabriolet cabriolet = new Cabriolet();		 
                 cabriolet.setMake("Mercedes");
                 cabriolet.setModel("C-class");
                 cabriolet.setYear(2015);
                 cabriolet.printCarInfo();
                 cabriolet.setDirection(80);
                 cabriolet.moveForward(77);
                 cabriolet.printPosition();
	}
			}


