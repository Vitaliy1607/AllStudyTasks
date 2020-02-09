import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Program {
   private static Dealer dealer = new Dealer();
   private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            System.out.println("Choose operation");
            System.out.println("1 Add car");
            System.out.println("2 show all cars");
            System.out.println("3 save all cars");
            System.out.println("4 show all saved cars");
            System.out.println("5 remove Car");
            System.out.println("0-Exit");
            int num = scn.nextInt();
            switch (num){
                case 1:
                    add();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    saveCar();
                    break;
                case 4:
                    showCar();
                    break;
                case 5:
                    remove();
                    break;
                case 0:
                    System.out.println("bye");
                    return;
            }
        }

    }
    public static void add(){
        System.out.println("Enter make");
        String make = scn.next();
        System.out.println("Enter model");
        String model = scn.next();
        System.out.println("Enter year");
        int year = scn.nextInt();
        if (!dealer.add(make,model,year)){
            System.out.println("car already exist");
        }else {
            System.out.println("Car " + make + " " + model + " is saved in List");
        }
    }

    public static void showAll(){
        for (Car car : dealer.getCars()){
            System.out.println(car);
        }
    }

    public static void remove(){
        System.out.println("Enter make for remove");
        String make = scn.next();
        if (dealer.removeCar(make)){
            System.out.println("Car " + make + " is deleted");
        }
    }
    public static void saveCar(){
        try {
            FileOutputStream fos = new FileOutputStream("car.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dealer.cars);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showCar() {
        try {
            FileInputStream fis = new FileInputStream("car.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            dealer.cars = (List<Car>) ois.readObject();

            for (Car car: dealer.cars){
                if (dealer.cars.isEmpty()){
                System.out.println("List is empty");
                }else {
                    System.out.println(car);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (EOFException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
