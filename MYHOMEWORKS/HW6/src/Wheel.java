
public class Wheel {
	private String wheelType;
	private int sizeR;
	
	public Wheel(String wheelType, int sizeR) {
		this.wheelType = wheelType;
		this.sizeR = sizeR;
	}
	
	public void rotate() {
		System.out.println("Rotate forward");
	}
	
	public String getWheelType() {
		return wheelType;
	}
	
	public void setWheelType(String wheelType) {
		this.wheelType = wheelType;
	}
	
	public int getSizeR() {
		return sizeR;
	}
	
	public void setSizeR(int sizeR) {
		this.sizeR = sizeR;
	}
	
	@Override
	public String toString() {
		return "Wheel [wheelType=" + wheelType + ", sizeR=" + sizeR + "]";
	}
	
	
}
