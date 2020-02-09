import comparator.compareByModel;
import comparator.compareByVolume;
import entity.Car;

import java.util.*;

public class Program {
    public static void main(String[] args) {
//        Set<String> names = new TreeSet<>(new compareByCase());
//        names.add("Ivan");
//        names.add("ivan");
//        names.add("Misha");
//        names.add("Vova");
//        names.add("Lesya");
//        names.add("Vasyl");
//
//        System.out.println(names);

        Comparator<Car> cmp = Comparator.comparing(Car::getMake).thenComparing(Car::getModel)
                .thenComparing(Car::getPrice).thenComparing(Car::getVolume);


        Set<Car> cars = new TreeSet<>(new compareByModel().reversed());
       // List<entity.Car> cars = new LinkedList<>();
        cars.add(new Car("Audi", "A4", 7600, 3.2));
        cars.add(new Car("Bmw", "3", 4000, 2.0));
        cars.add(new Car("Volkswagen", "B5", 5800, 1.9));
        cars.add(new Car("Suzuki", "Baleno", 3000, 1.3));
      //  cars.sort(null);


       cars.forEach(System.out:: println);

       }
}
