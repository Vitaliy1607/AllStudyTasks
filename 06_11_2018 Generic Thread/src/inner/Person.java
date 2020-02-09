package inner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Pet> pets = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printPetNick() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public enum Gender {
        MALE, FEMALE;
    }

    public static class ComparatorByName implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return Comparator.comparing(Person::getName)
                    .thenComparing(Person::getAge)
                    .compare(o1, o2);
        }
    }

    public class Pet {
        private String nick;

        public Pet(String nick) {
            this.nick = nick;
            pets.add(this);
        }

        public String getNick() {
            return nick;
        }

        public void test() {
            System.out.println(name);
            System.out.println(getName());
        }

        @Override
        public String toString() {
            return "Pet{" +
                    "nick='" + nick + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
