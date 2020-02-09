package Interfaces;

import java.util.UUID;

public class Teleport implements Moveable {
    private int x;
    private int y;
    private String id;
    
    public Teleport() {
       id = UUID.randomUUID().toString();	
     }
    
	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	public void printPosition() {
	System.out.println("x=" + x + ", y=" + y + " - " + id);
		
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	

}
