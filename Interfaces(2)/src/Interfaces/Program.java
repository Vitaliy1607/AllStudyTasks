package Interfaces;

public class Program {

	public static void main(String[] args) {
          Moveable moveable = new Teleport();
          moveable.printPosition();
          moveable.move(10, 15);
          moveable.move(10, 20);
          moveable.printPosition();
          
          Garage garage = new Garage(null, 2500, 2222);
          garage.setMoveable(moveable);
          moveable.printPosition();
          garage.move(45, 22);
          moveable.printPosition();
          
          
	}

}
