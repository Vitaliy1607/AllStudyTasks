package interfaces;

public class Car implements MoveAble, MotorVehicle{
	private String name;
	private int x;
	private int y;
	
	

	public Car() {
		
	}

	public Car(String name) {
		super();
		this.name = name;
	}

	@Override
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	@Override
	public void printPosition() {
		System.out.println(name + ": x= " + x + ", y= " + y);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
