package Pets;

import java.util.Objects;

public class Cat1 implements Comparable<Cat1> {
    private String name;
    private int tail;

    public Cat1(String name, int tail) {
        this.name = name;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Cat1{" +
                "name='" + name + '\'' +
                ", tail=" + tail +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat1 cat1 = (Cat1) o;
        return tail == cat1.tail &&
                Objects.equals(name, cat1.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, tail);
    }



    @Override
    public int compareTo(Cat1 o) {
        int res = name.compareTo(o.name);
return res;
    }

}

