import entity.Student;

import java.util.*;

public class Program2 {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(0, "zero");
//        map.put(1, "one");
//        map.put(2, "two");
//        map.put(3, "three");
//        map.put(4, "three");
//        System.out.println(map.containsKey(443));
//
//        System.out.println(map.size());
//        System.out.println(map.isEmpty());
//        System.out.println();
//        System.out.println(map.get(4));
//        map.clear();
//        System.out.println(map.get(4));
//
//        System.out.println(map);

        Map<String , List<Student>> groups = new HashMap<>();
        List<Student> group1 = new ArrayList<>();
        group1.add(new Student("Pavlo", "Ihoriv", 44 , 77.5));
        group1.add(new Student("Andriy", "Petruk", 18 , 44));
        group1.add(new Student("Ivan", "Ivanov", 40 , 78));
        groups.put("group1", group1);

        List<Student> group2 = new ArrayList<>();
        group2.add(new Student("Ihor", "Tuhuy", 18 , 60.4));
        group2.add(new Student("Andriy", "Shet", 33 , 30));
        group2.add(new Student("Vasyl", "Bor", 25 , 55.5));
        groups.put("group2", group2);

//        Set<String> keys = groups.keySet();
//        Iterator<String> iterator = keys.iterator();
//        while(iterator.hasNext()){
//            String key = iterator.next();
//            List<Student> students = groups.get(key);
//            System.out.println(key);
//            for (Student student : students) {
//                System.out.println(student);
//            }
//            System.out.println();
//            iterator.remove();
//        }
//        System.out.println(groups.size());

//        Set< Map.Entry< String, List<Student> > > entries = groups.entrySet();
//        Iterator<Map.Entry<String, List<Student>>> iterator = entries.iterator();
//        List<Student> soldiers = new ArrayList<>();
//        while (iterator.hasNext()){
//            Map.Entry<String, List<Student>> next = iterator.next();
//            String key = next.getKey();
//            List<Student> students = next.getValue();
//
//            Iterator<Student> stIterator = students.iterator();
//            while(stIterator.hasNext()){
//                Student student = stIterator.next();
//                if (student.getAvgScore()< 50){
//                    stIterator.remove();
//                    soldiers.add(student);
//                }
//            }
//
//        }
//        System.out.println(soldiers);
//        System.out.println();
//        System.out.println(groups);

        Map<String, Integer> namesCount = new HashMap<>();

        for (Map.Entry<String, List<Student>> entry : groups.entrySet()) {
            for (Student student: entry.getValue()){
                String name = student.getName();
                if(!namesCount.containsKey(name)){
                    namesCount.put(name, 1);
                }else{
                    Integer count = namesCount.get(name);
                    namesCount.put(name, ++count);
                }
        }

        }
        System.out.println(namesCount);
        }

    }

