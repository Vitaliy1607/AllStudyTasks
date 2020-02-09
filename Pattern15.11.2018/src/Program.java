import javafx.util.Builder;

public class Program {
    public static void main(String[] args) {
        Person person = new Person("Anton" , "Ivanov" , 33 , 77.5 , "male");
        Person build = new Person.Builder()
                .gender("Female")
                .name("Ira")
                .age(54)
                .build();
        System.out.println(build);
    }


}
