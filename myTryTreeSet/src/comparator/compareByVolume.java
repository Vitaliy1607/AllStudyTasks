package comparator;

import java.util.Comparator;
import entity.Car;

public class compareByVolume implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.getPrice(),o2.getPrice());
    }
}
