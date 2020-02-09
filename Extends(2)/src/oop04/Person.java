package oop04;

public class Person {
      private String name;
      private int age;
      
      public Person(String name , int age) {
    	  this.name = name;
    	  this.age = age;
      }
      public void think() {
    	  System.out.println(name + " is thinking about life");
      }
      
      public String getName() {
    	  return name;
      }
	public void setName(String name) {
		this.name = name;
	}
       @Override	
	public String toString() {
		return name + ", " + age + "y.o";
	}
}
