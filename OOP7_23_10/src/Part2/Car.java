package Part2;

public class Car {
    private String name;
    private int year;
    private double volume;
	
    public Car(String name, int year, double volume) {
		super();
		this.name = name;
		this.year = year;
		this.volume = volume;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + ", volume=" + volume + "]";
	}
    
    
}
