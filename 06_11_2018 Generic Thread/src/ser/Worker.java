package ser;

import java.io.Serializable;

public class Worker implements Serializable {
    private String name;
    private int salary;
    private transient Address address;

    public Worker(String name, int salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
