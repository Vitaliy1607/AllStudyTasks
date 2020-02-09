package Interfaces;

public class Garage {
	private Moveable moveable;
	private int x;
	private int y;
	
	public void move (int x , int y) {
		if(moveable!= null) {
		 moveable.move(x, y);	
		}
	}

	public Garage(Moveable moveable, int x, int y) {
		super();
		setMoveable(moveable);
		this.x = x;
		this.y = y;
	}

	public Moveable getMoveable() {
		return moveable;
	}

	public void setMoveable(Moveable moveable) {
		this.moveable = moveable;
		if(moveable!= null) {
			moveable.setX(x);
			moveable.setY(y);
		}
	}
	
	

}
