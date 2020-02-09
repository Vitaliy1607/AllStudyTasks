package interfaces;

public interface MoveAble {
	
	void move(int x , int y);
	
	default void printPosition() {
		System.out.println("This is no position");
	}
	
	default void setX(int x) {
		
	}
	
    default void setY(int y) {
		
	}
}
