package entity;

import java.util.Objects;
import java.util.UUID;

public class Client {
    private String name;
    private String id;
    private long sumOfCarPrices;

    public Client(String name) {
        id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSumOfCarPrices() {
        return sumOfCarPrices;
    }

    public void setSumOfCarPrices(long sumOfCarPrices) {
        this.sumOfCarPrices = sumOfCarPrices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return sumOfCarPrices == client.sumOfCarPrices &&
                Objects.equals(name, client.name) &&
                Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, sumOfCarPrices);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
