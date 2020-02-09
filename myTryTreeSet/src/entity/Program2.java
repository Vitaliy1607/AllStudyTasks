package entity;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Program2 {
    public static void main(String[] args) {
        Set<String> states = new TreeSet<>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");
        states.add("Great Britain");
        System.out.println(states);
        System.out.println();

        System.out.println(((TreeSet<String>) states).last());
        System.out.println(states.iterator());

        SortedSet<String> set = ((TreeSet<String>) states).subSet("Germany", "Italy");
        System.out.println(set);
    }
}
