import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vasyl","Sem", 22 , 44.5));
        students.add(new Student("Vasyl","Sem", 22 , 44.5));
        students.add(new Student("Vasyl","Sem", 22 , 44.5));
        students.add(new Student("Vasyl","Sem", 22 , 44.5));
        students.add(new Student("Inna","Sem", 22 , 44.5));
        students.add(new Student("Inna","Sem", 22 , 44.5));
        students.add(new Student("Inna","Sem", 22 , 44.5));

       Map<String, Integer> namesCount = new HashMap<>();

        for (Student student : students) {
            String name = student.getName();
            if (!namesCount.containsKey(name)){
                namesCount.put(name, 1);
            }else{
                Integer count = namesCount.get(name);
                namesCount.put(name , ++count);
            }
        }
        System.out.println(namesCount);
    }
}
