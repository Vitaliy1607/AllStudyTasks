import java.util.*;

public class Program {

    public static void main(String[] args) {
        Map<String , List<Student> > groups = new HashMap<>();
        List<Student> group1 = new ArrayList<>();
        group1.add(new Student("Vasyl","Sem", 22 , 44.5));
        group1.add(new Student("Ivan","Holoc", 19 , 70.3));
        group1.add(new Student("Muron","Kolt", 18 , 55.4));
        groups.put("group1" , group1);

        List<Student> group2 = new ArrayList<>();
        group2.add(new Student("Volodya","Mol", 16 , 46.5));
        group2.add(new Student("Volodya","Mol", 16 , 46.5));
        group2.add(new Student("Oleh","Vorohta", 19 , 70.3));
        group2.add(new Student("Igor","Zbarash", 18 , 55.4));
        groups.put("group2" , group2);

//        Set<String> keys = groups.keySet();
//        Iterator<String> iterator = keys.iterator();
//        while (iterator.hasNext()){
//        String key = iterator.next();
//        List<Student> students = groups.get(key);
//            System.out.println(key);
//            for (Student student : students) {
//                System.out.println(student);
//            }
//            System.out.println();
//        }

        Set<Map.Entry<String, List<Student>>> entries = groups.entrySet();
        Iterator<Map.Entry<String, List<Student>>> iterator = entries.iterator();
        List<Student> soldiers = new ArrayList<>();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Student>> next = iterator.next();
            String key = next.getKey();
            List<Student> students = next.getValue();
            Iterator<Student> stiterator = students.iterator();
            while (stiterator.hasNext()) {
                Student student = stiterator.next();
                if (student.getAvgScore()<50) {
                    stiterator.remove();
                    soldiers.add(student);
                }
            }
        }
        System.out.println(soldiers);
        System.out.println(groups);

       Map<String , Integer> names = new HashMap<>();
        for (Map.Entry<String, List<Student>> entry : groups.entrySet()) {
            for (Student student : entry.getValue()) {
                String name = student.getName();
                if (!names.containsKey(name)){
                    names.put(name, 1);
                }else{
                    Integer count = names.get(name);
                    names.put(name , ++count);
                }
            }
        }
        System.out.println(names);
    }
}
