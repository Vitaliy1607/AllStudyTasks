package generics;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> integers =  Arrays.asList(43,23 , 33 ,5);
        List<Double> doubles =  Arrays.asList(55.2 , 23.2 , 33.4 , 5.8);
        System.out.println(sum(integers));
        System.out.println(sum(doubles));
    }
    public static Double sum(List<? extends Number> list){
        Double sum = 0.0;
        for (Number number : list) {
            sum+= number.doubleValue();
        }
        return sum;
    }
}
