package generics;

import java.util.*;

public class Program {
    public static void main(String[] args) {
//        List<Number> l1 = new List<>();
//        List<Number> l5 = new ArrayList<>();
//        List<Number> l7 = new ArrayList<Integer>();
//        List<Number> l2 = new List<Number>();
//        List<Number> l3 = new List<Integer>();
//        List<Object> l4 = new ArrayList<String>();

        List<Integer> integers = Arrays.asList(43, 23, 33, 5);
        List<Double> doubles = Arrays.asList(55.2, 32.5, 77.6);

        System.out.println(sum(integers));
        System.out.println(sum(doubles));

        Container<String> container = new Container<>("Hello");
        System.out.println(container.getVal().toUpperCase());

        String[] strs = new String[5];
        fill(strs, "Hi");
        System.out.println(Arrays.toString(strs));
    }

    public static <T> void fill(T[] arr, T el) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = el;
        }
    }

    public static Double sum(List<? extends Number> list) {
        Double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
