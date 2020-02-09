public class Person {
    private String name;
    private String surname;
    private int age;
    private double weight;
    private String gender;

    public Person() {
    }

    public Person(String name, String surname, int age, double weight, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
    public static class Builder{
         private Person person = new Person();

        public Builder name(String name){
            person.name = name;
            return this;
        }

        public Builder surname(String surname){
            person.surname = surname;
            return this;
        }
        public Builder age(int age){
            person.age = age;
            return this;
        }
        public Builder weight(Double weight){
            person.weight = weight;
            return this;
        }
        public Builder gender(String gender){
            person.gender = gender;
            return this;
        }
        public Person build(){
            return person;
        }
    }
}
