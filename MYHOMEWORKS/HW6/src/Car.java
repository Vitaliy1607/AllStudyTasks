
public class Car {
	private String mark;
	private String model;
    private String color;
    private int year;
    
	public Car(String mark, String model, String color, int year) {
		super();
		this.mark = mark;
		this.model = model;
		this.color = color;
		this.year = year;
	}
	
	public void drive() {
		System.out.println(mark + " " + model + " is drive in different direction");
	}
	
	public String getMark() {
		return mark;
	}
	
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [mark=" + mark + ", model=" + model + ", color=" + color + ", year=" + year + "]";
	}
	
	
    
    
    
}
