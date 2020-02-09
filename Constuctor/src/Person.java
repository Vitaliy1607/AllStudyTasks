
public class Person {
	// TODO Auto-generated method stub
    private int age;
    private String name;
    private String gender;
    private double weight;
     
    int lenght;
    
    public Person() {
    	//System.out.println("Person with name" + name + "been created");
    	this(2 , "no-name" , "uknown" , 0.0);
    }
   
    public Person(int age, String name, String gender, double weight) {
    	setAge(age);
  	this.name =name;
  	this.gender = gender;
  	this.weight = weight;
    }
    public void think(String target) {
  	  System.out.println(name + "is thinking about" + target);
    }
    
    public int getAge() {
  	  return age;
    }
    public void setAge(int age) {
  	 if(age<140 && age >=0) {
  		 this.age = age;
  	 }else {
  		 System.out.println("asfagawg");
  	 }

  }
    
	
}
