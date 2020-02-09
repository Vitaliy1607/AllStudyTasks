public class Program {
    public static void main(String[] args) {
        Animal animal = new Cat("Vasya", 2);

        animal.setName("Bobik");
        animal.setAge(2);
        System.out.println("My name is " + animal.getName() + " and i have " + animal.getAge() + " years");
    }

}
