import com.sun.org.apache.regexp.internal.RE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.ListIterator;

public class Program {
    private static final CarDealer DEALER = new CarDealer();
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        while (true) {

            switch (READER.readLine()) {
                case "1":
                    addCar();
                    break;
                case "2":
                    printAllCars();
                    break;
                case "3":
                    addClient();
                    break;
                case "4":
                    printAllClients();
                    break;
                case "5":
                    addCarToClient();
                    break;
                case "exit":
                    System.out.println("bye");
                    return;
                default:
                    System.out.println("There is no such option");
            }
        }
    }

    public static void addCar() throws IOException {
        System.out.println("Enter make: ");
        String make = READER.readLine();
        System.out.println("Enter model: ");
        String model = READER.readLine();
        System.out.println("Enter year: ");
        Integer year = Integer.valueOf(READER.readLine());
        System.out.println("Enter volume: ");
        Double volume = Double.valueOf(READER.readLine());
        System.out.println("Enter price: ");
        Integer price = Integer.valueOf(READER.readLine());
        Car car = new Car(make, model, year, price, volume);
        if (DEALER.addCar(car)) {
            System.out.println("car added");
        } else {
            System.out.println("car " + car + " already exists");
        }
    }

    public static void printAllCars() {
        if (DEALER.getCars().isEmpty()) {
            System.out.println("There is no cars");
            return;
        }
        for (Car car : DEALER.getCars()) {
            System.out.println(car);
        }
    }

    public static void addClient() throws IOException {
        String name = READER.readLine();

        DEALER.addClient(new Client(name));
    }

    public static void printAllClients() {
        if (DEALER.getClients().isEmpty()) {
            System.out.println("There are no clients");
        }

        for (ListIterator<Client> iterator = DEALER.getClients().listIterator(); iterator.hasNext(); ) {
            System.out.print(iterator.nextIndex() + ": ");
            System.out.println(iterator.next());
        }

    }

    public static void addCarToClient() throws IOException {
        System.out.println("Select client: ");
        printAllClients();
        Client client =
                DEALER.getClients().get(Integer.valueOf(READER.readLine()));

        System.out.println("Select car: ");
        printAllCars();
        Car car =
                DEALER.getCars().get(Integer.valueOf(READER.readLine()));

        DEALER.addCarToClient(client, car);
    }


}
