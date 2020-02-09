package Pets;

import java.util.*;

public class Program {
    public static void main(String[] args) {


//        Map<String, Pet> pets = new HashMap<>();
//        pets.put("cat" , new Cat("Мурзик"));
//        pets.put("dog", new Dog("Barbos"));
//        pets.put("parrot", new Parrot("Kesha"));
//        Pet kot = pets.get("cat");
//        System.out.println(kot);
//        System.out.println(pets.containsKey("cat"));
//        System.out.println(pets.containsValue(kot));

//        Map<Person, List<? extends Pet>> info = new HashMap<>();
//        info.put(new Person("Ivan"),Arrays.asList( new Cat("Barskik"), new Parrot("Jack")));
//        info.put(new Person("Inna"), Arrays.asList(new Dog("Jonhy"), new Cat("Viskas")));
//
//        System.out.println("info" + info);
//        System.out.println("keyset" + info.keySet());
//
//        for (Person person : info.keySet()) {
//            System.out.println(person + " have");
//            for (Pet pet : info.get(person)) {
//                System.out.println(" " + pet);
//            }
//        }

        Set<Cat1> treeSet  = new TreeSet<>();
        treeSet.add(new Cat1("Bob" , 12));
        treeSet.add(new Cat1("Rich" , 6));
        treeSet.add(new Cat1("Ant" , 15));
        treeSet.add(new Cat1("Tou" , 4));
        treeSet.add(new Cat1("jiz" , 3));


    }
}
