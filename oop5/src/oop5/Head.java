package oop5;


public class Head {
      private String hairColor;
      private Brain brain;

	

	public Head(String hairColor) {
		super();
		this.hairColor = hairColor;
	}
	public Head(String hairColor, Brain brain) {
		super();
		this.hairColor = hairColor;
		this.brain = brain;
	}
	
	public void think() {
		brain.think();
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	
}
