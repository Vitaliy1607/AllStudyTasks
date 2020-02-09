package entity;

import Comperator.StringComparatorIgnoreCase;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Random rnd = new Random(36);
//        Set<String> names = new TreeSet<>(new StringComparatorIgnoreCase());
//        names.add("Petro");
//        names.add("Anton");
//        names.add("anna");
//        names.add("Anna");
//        names.add("Fedir");
//
//        System.out.println(names);

        Comparator<Student> cmp = Comparator.comparing(Student::getAge).thenComparing(Student::getName)
                .thenComparing(Student::getName).thenComparing(Student::getAvgScore);
//
//       Set<Student> students = new TreeSet<>(cmp);
//       List<Student> students = new ArrayList<>();
//        students.add(new Student("Petro", "Antoniv", 24 , 77.5));
//        students.add(new Student("Ihor", "Petriv", 22 , 77.5));
//        students.add(new Student("Ihor", "Petriv", 22 , 77.5));
//        students.add(new Student("Ihor", "Petriv", 22 , 77.5));
//
//        students.add(new Student("Anna", "Ivanets", 24 , 66.5));
//        students.add(new Student("Anna", "Antoniv", 24 , 66.5));
//        students.add(new Student("Fedir", "Kravers", 22 , 66.5));
//        students.add(new Student("Fedir", "Kravers", 22 , 66.5));
//        students.add(new Student("Fedir", "Kravers", 22 , 66.5));
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//
//        Collections.sort(students, cmp);
//        students.sort(cmp);
//        students.sort(null);
//
//        for (Student student : students){
//            System.out.println(student);
//        }
//     Map<Integer , Integer> namesCount = new HashMap<>();
//        for (Student student : students) {
//            Integer age = student.getAge();
//            if (!namesCount.containsKey(age)){
//                namesCount.put(age, 1);
//            }else{
//                Integer count = namesCount.get(age);
//                namesCount.put(age, ++count);
//            }
//
//        }
//        System.out.println(namesCount);

//        Map<String, String> vars = new HashMap<>();
//        vars.put("1", "a");
//        vars.put("2", "b");
//        vars.put("3", "c");
//
//        for (Iterator<String> it = vars.keySet().iterator();it.hasNext();) {
//            if ("3".equals(it.next())){
//                it.remove();
//            }
//        }
//        System.out.println(vars);
        Map<Integer, Integer> nums = new HashMap<>(100);
         for (int i = 0;i < 100;i++){
             int number = rnd.nextInt(10);
             Integer frequency = nums.get(number);
             nums.put(number, frequency == null ? 1 : frequency + 1);
         }
        System.out.println(nums);
    }


}
