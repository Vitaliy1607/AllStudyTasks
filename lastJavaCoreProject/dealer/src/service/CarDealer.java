package service;

import entity.Car;
import entity.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarDealer {
    private List<Car> cars = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();
    private Map<Client, List<Car>> clientCars = new HashMap<>();

    private Map<In>


    public boolean addCar(Car car) {
        return cars.add(car);
    }

    public boolean addClient(Client client) {
        return clients.add(client);
    }

    public boolean addCarToClient(Client client, Car car) {
        if (!clientCars.containsKey(client)) {
            clientCars.put(client, new ArrayList<>());
        }
        clientCars.get(client).add(car);
        client.setSumOfCarPrices(client.getSumOfCarPrices() + car.getPrice());
        return true;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Client> getClients() {
        return clients;
    }
}
