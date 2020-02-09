package Thread;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("Auto");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            List<String> cars = new ArrayList<>();
            cars.addAll(Arrays.asList("Audi" , "VW" , "BMW" , "Ford"));
            oos.writeObject(cars);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("Auto");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            System.out.println(o);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
