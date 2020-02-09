package entity;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String make;
    private String model;
    private int price;
    private double volume;

    public Car(String make, String model, int price, double volume) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.volume = volume;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "entity.Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                Double.compare(car.volume, volume) == 0 &&
                Objects.equals(make, car.make) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {

        return Objects.hash(make, model, price, volume);
    }


    @Override
    public int compareTo(Car o) {
        int res = make.compareTo(o.make);
        if(res == 0){
            res = model.compareTo(o.model);
            if (res == 0){
                res = Integer.compare(price, o.price);
                if (res == 0){
                    res = Double.compare(volume, o.volume);
                }
            }
        }
        return res;
    }
}
