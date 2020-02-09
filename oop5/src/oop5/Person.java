package oop5;


public class Person {
      private String name;
      private int age;
      private Head head;
      private Body body;
      private Legs legs;
      
     
      
      public Person(String name , int age) {
    	  this.name = name;
    	  this.age = age;
      }
      
      public String getName() {
    	  return name;
      }
	public Person(String name, int age, Head head, Body body, Legs legs) {
		super();
		this.name = name;
		this.age = age;
		this.head = head;
		this.body = body;
		this.legs = legs;
	}
	
	public void think() {
		head.think();
		}
	
	 public void run() {
		 if (legs != null) {
   	  legs.run(name);
   	  }else {
         legs = new Legs();
		  }
		 }
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Legs getLegs() {
		return legs;
	}
	public void setLegs(Legs legs) {
		this.legs = legs;
	}
	public void setName(String name) {
		this.name = name;
	}
       @Override	
	public String toString() {
		return name + ", " + age + "y.o";
	}
}
