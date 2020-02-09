
public class Person {
        private String name;
         private String forname;
       private  int age;
        private double height;
         private String profession;
     //ЩОБ ЗРОБИТИ ІНКАПСУЛЯЦІЮ ПОТРІБНО
     //1 ДОДАТИ МОДИФІКАТОР PRIVATE ДО ПОЛЯ
//      2 СТВОРИТИ 2 МЕТОДИ - GETTER & SETTER
         
         String getName() {
        	 return name;
         }
         
        public int getAge() {
			return age;
		}

		public void setAge(int age) {
			if(age>70) {
				this.age = 70;
			}else {
				this.age = age;
			}
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public String getProfession() {
			return profession;
		}

		public void setProfession(String profession) {
			this.profession = profession;
		}

		void setName(String name) {
			if(name.length()>20) {
				this.name = name.substring(0, 20);
			}else {
        	this.name = name;
        	} // this.-знайти поле імя і заповнити в це значченя
        }
         
         String getFullName() {
        	 return name + " " + getForname();
         } 
         String getFullInfo() {
        	 return getFullName() + "(age: "+age+";height: " + height + " )";
         }

		String getForname() {
			return forname;
		}

		void setForname(String forname) {
			this.forname = forname;
		}
}
