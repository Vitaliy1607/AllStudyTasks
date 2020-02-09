
public class Person {
	    private static int count = 0;
        private String name;
        private final int age;
        private String gender;
		private final address address;
        
        


		public Person(String name, int age, String gender , address address) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.address = address;
			count++;
		}
		


		public void sleep(int hours) {
		System.out.println(name + "will be slepping during" + hours);
		}

            public static int getCount() {
            	return count;
            }

		public address getAddress() {
			return address;
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


		public int getAge() {
			return age;
		}
		


		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}
		
        
        
}
