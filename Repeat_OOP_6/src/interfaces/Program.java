package interfaces;

public class Program {

	public static void main(String[] args) {
		MoveAble moveAble = new Car("Audi A5");
		moveAble.printPosition();
		moveAble.move(10, 15);
		moveAble.move(10, 20);
		moveAble.printPosition();
		
		Garage garage = new Garage(null, 2500, 2222);
		garage.setMoveAble(moveAble);
		moveAble.printPosition();
	}

}
