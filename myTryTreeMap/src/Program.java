import java.util.*;

public class Program {
    public static void main(String[] args) {
//        Map<Integer , String> names = new HashMap<>();
//        names.put(1, "Vasya");
//        names.put(2, "Ivan");
//        names.put(3, "Igor");
//
//        System.out.println(names);

        Map<String, List<Student>> groups = new HashMap<>();
        List<Student> group1 = new ArrayList<>();
        group1.add(new Student("Pavlo", "Ivaniv", 23, 77.5));
        group1.add(new Student("Pavlo", "Ihoriv", 23, 33.5));
        group1.add(new Student("Ivan", "Petriv", 19, 47.5));
        groups.put("group1", group1);


        List<Student> group2 = new ArrayList<>();
        group2.add(new Student("Andriy", "Petruk", 18, 99.5));
        group2.add(new Student("Ivan", "Ivanov", 23, 63.5));
        group2.add(new Student("Anton", "Vasylkiv", 33, 57.5));
        groups.put("group2", group2);

        Set<String> keys = groups.keySet();
        Iterator<String> iterator = keys.iterator();

    }
}
