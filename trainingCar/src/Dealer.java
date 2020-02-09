import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dealer implements Serializable {
    List<Car> cars = new ArrayList<>();

//    public boolean addcar(Car car){
//        return cars.add(car);
//    }

    public boolean add(String make,String model ,int year){
        return cars.add(new Car(make,model,year));
    }

    public List<Car> getCars() {
        return cars;
    }

    public boolean removeCar(String make){
        boolean exist = false;
        Iterator<Car> deleted = cars.iterator();
        if (deleted.hasNext()){
           Car car = deleted.next();
            if (car.getMake().equalsIgnoreCase(make)){
                deleted.remove();
            }

        }
        return exist;
    }
}
