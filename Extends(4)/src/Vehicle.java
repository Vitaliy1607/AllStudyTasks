/*//
*/public class Vehicle {
  private double x;
  private double y;

  private double direction;
  
  public void moveForward(double distance) {
	  x += distance * Math.cos(direction/ 180 * Math.PI);
	  y += distance * Math.sin(direction/ 180 * Math.PI);
  }
  
  public void printPosition() {
	  System.out.println("x: " + x + ", y: " + y);
  }

public double getX() {
	return x;
}

public double getY() {         // alt + shift + s - визиваются гетери і сетери
	return y;
}

public double getDirection() {
	return direction;
}

public void setDirection(double direction) {
	this.direction = direction;
}
  
  
}
