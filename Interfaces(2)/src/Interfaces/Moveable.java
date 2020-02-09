package Interfaces;

public interface Moveable {
	
	int SPEED = 20;
	
	void move(int x , int y);
	default void printPosition() {
		System.out.println("There is no position");
	}
	
	default void setX(int x) {
		
	}
	
    default void setY(int y) {
		
	}
}
