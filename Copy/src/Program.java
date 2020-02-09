
public class Program {
    public static void main(String[] args) {
        System.out.println(Person.getCount());

        Person person = new Person("Anton", 32, "Male", null);

        Address address = new Address("Lviv", "Franka");
        final int ARRAY_SIZE = 47;
        final Person person1 = new Person("Ivan", 44, "Male", address);
//        System.out.println(person1);
//        person1.setName("Petro");
//        System.out.println(person1);
//        System.out.println(person1.getAddress());
//        person1.getAddress().setStreet("Pasichna");
//        System.out.println(person1.getAddress());

//        System.out.println(Math.ceil(5.5));
//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//
//
//        System.out.println(Person.getCount());


//        Worker worker = new Worker("Ivan", 44, "Male", address);

        Worker[] workers = new Worker[4];
        workers[0] = new ParkingSecurity("Ivan", 44, "Male", 200, "staff");
        workers[1] = new ParkingSecurity("Olya", 33, "Female", 500, "staff");
        workers[2] = new Developer("Inna", 44, "Female", 1200, "JS");
        workers[3] = new Developer("Anton", 24, "Male", 800, "Java-dev");

        for (int i = 0; i < workers.length; i++) {
            workers[i].askSalary();
            workers[i].work();
        }
        for (int i = 0; i < workers.length; i++) {
            workers[i].askSalary();
            workers[i].work();
        }
    }
}
