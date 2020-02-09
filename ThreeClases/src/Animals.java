
public class Animals {
private double x;
private double y;

private double direction;

public void moveForward(double distance) {
	  x += distance * Math.cos(direction/ 180 * Math.PI);
	  y += distance * Math.sin(direction/ 180 * Math.PI);
}
}
