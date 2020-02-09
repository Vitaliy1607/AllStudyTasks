
public class Person {
	   private String mark;
	   private int year;
       private Helm helm;
       private Wheel wheel;
       private Body body ;
	
       public Person(Helm helm, Wheel wheel, Body body) {
		this.helm = helm;
		this.wheel = wheel;
		this.body = body;
	}
       
	public Person(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}
	public void rotate() {
		System.out.println("Rotate forward");
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}
     
       
       
}
