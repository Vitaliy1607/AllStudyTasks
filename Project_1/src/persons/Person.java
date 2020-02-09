package persons;

 // Інкапсуляція - Захист даних

public class Person {
     private int age;  
     private String name;
     private String gender;
     private double weight;
     int length;
     
     public Person() {
    	 this(0, "no-name", "uknown", 0.0);
     }
     
     public Person(int age, String name, String gender, double weight) {
    	 setAge(age);
    	 this.name = name;
    	 this.gender = gender;
    	 this.weight = weight;
    }
     
     public void think(String target) {
    	 System.out.println(name + " is thinking about " + target);
     }
     
     public int getAge() {
    	 return age;
     }
     
     public void setAge(int age) {
    	 if(age < 140 && age >= 0) {
    	 this.age = age;
    	 } else {
    		 System.err.println("Age must to be > 0 and < 140");
    	 }
     }
     
     public String getName() {
    	 return name;
     }
     
     public void setName(String name) {
    	 this.name = name;
     }

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
     
}
