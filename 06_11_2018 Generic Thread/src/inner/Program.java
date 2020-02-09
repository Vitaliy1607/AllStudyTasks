package inner;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Person.Gender g = Person.Gender.FEMALE;

//        Set<Person> set =
//                new TreeSet<>(new Person.ComparatorByName());

        Comparator<Person.Pet> cmp = new Comparator<Person.Pet>() {
            public int compare(Person.Pet o1, Person.Pet o2) {
                return o1.getNick().compareTo(o2.getNick());
            }
        };

        Comparator<Person.Pet> cmp1 =
                Comparator.comparing(Person.Pet::getNick);


        Set<Person.Pet> set1 =
                new TreeSet<Person.Pet>(cmp1);

        Person person1 = new Person("Ihor", 55);
        Person.Pet pet1 = person1.new Pet("tuzik");
        Person.Pet pet2 = person1.new Pet("pushok");

        pet1.test();

        person1.printPetNick();

        Person p1 = new Person("Anton", 22);
        p1.printPetNick();
    }


    public static Serializable get() {
        class Abstract implements Serializable {
            int field1;
            String field2;
        }

        Abstract a = new Abstract();
        a.field1 = 22;
        a.field2 = "aaa";

        return a;
    }

}
