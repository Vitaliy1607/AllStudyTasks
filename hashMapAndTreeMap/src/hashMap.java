import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        Random rnd = new Random(36);
//        Map<Integer, String> names = new HashMap<>();
//        names.put(1, "Anton");
//        names.put(2, "Borus");
//        names.put(3, "Misha");
//        names.put(6, "Zed");
//        names.put(4, "Oleh");
//        names.put(5, "Vira");
//
////        for(Map.Entry entry : names.entrySet()){
////            System.out.println("Key " + entry.getKey() + ": Value " + entry.getValue());
////        }
//
//        Map<String , Integer> cats = new HashMap<>();
//        cats.put("Bob" , 12);
//        cats.put("Tom" , 8);
//        cats.put("Jusy" , 5);
//        cats.put("Lisa" , 1);
//        cats.put("Richard" , 8);
//
//      // Set< Map.Entry<String , Integer>> cat = cats.entrySet();
//        Set<Map.Entry<String, Integer>> entries = cats.entrySet();
//
//        for (Map.Entry<String, Integer> me : entries){
//            System.out.println(me.getKey() + " " + me.getValue());
//        }
//
//        int value = cats.get("Tom");
//        cats.put("Tom", value +3);
//        System.out.println("У Tom стало " + cats.get("Tom"));
//        for (Map.Entry<String, Integer> me : entries){
//            System.out.println(me.getKey() + " " + me.getValue());
//        }

//        Map<Integer , Integer> rand = new HashMap<>();
//
//        for (int i = 0;i < 100;i++){
//            int number = rnd.nextInt(10);
//            Integer frequancy = rand.get(number);
//            rand.put(number, frequancy == null ? 1 : frequancy + 1);
//        }
//        System.out.println(rand);

        Map<String, List<Student>> groups = new HashMap<>();
        List<Student> group1 = new ArrayList<>();
        group1.add(new Student("Anton", "Zybov" , 77.5));
        group1.add(new Student("Valera", "Filat" , 44.3));
        group1.add(new Student("Sasha", "Groznyi" , 60.2));
        groups.put("group1", group1);

        List<Student> group2 = new ArrayList<>();
        group2.add(new Student("Serhyi", "Prach" , 77.5));
        group2.add(new Student("Vlad", "Pruhod" , 44.3));
        group2.add(new Student("Andriy", "Purih" , 60.2));
        groups.put("group2", group2);

//        Set<String> keys = groups.keySet();
//        Iterator<String> iterator = keys.iterator();
//        while (iterator.hasNext()){
//            String key = iterator.next();
//            List<Student> students = groups.get(key);
//            System.out.println(key);
//            for (Student student : students) {
//                System.out.println(student);
//            }
//            System.out.println("");
//        }
        Set<Map.Entry<String, List<Student>>> entries = groups.entrySet();
        Iterator<Map.Entry<String, List<Student>>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, List<Student>> next = iterator.next();
            String key = next.getKey();
            List<Student> students = next.getValue();
            System.out.println(key);
            for (Student student : students) {
                System.out.println(student);
            }
            System.out.println();
        }
    }

}
