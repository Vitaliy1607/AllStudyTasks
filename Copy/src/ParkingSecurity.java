public class ParkingSecurity extends Worker {
    public ParkingSecurity(String name, int age, String gender, int salary, String role) {
        super(name, age, gender, salary, role);
    }

    @Override
    public void work() {
        System.out.println(getName() + " Sleeping...");
    }

    @Override
    public void askSalary() {
        System.out.println("you earn: " + getSalary());
    }
}
