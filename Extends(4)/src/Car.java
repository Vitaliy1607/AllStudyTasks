
public class Car extends Vehicle {
                private String make;
                private String model; // Наследование - extends
                private int year;
				
                public Car(String make, String model, int year) {
					this.make = make;
					this.model = model;
					this.year = year;
				}
                
                
                public void printCarInfo() {
                	System.out.println(make + " " + model + " `" + year%100);
                }
                protected Car() {
                	
                }

				public String getMake() {
					return make;
				}

				public void setMake(String make) {
					this.make = make;
				}

				public String getModel() {
					return model;
				}

				public void setModel(String model) {
					this.model = model;
				}

				public int getYear() {
					return year;
				}

				public void setYear(int year) {
					this.year = year;
				}
			
                
}
