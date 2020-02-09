package ser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        try (
                FileOutputStream fos = new FileOutputStream("aa");
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
//            List<Integer> list = new ArrayList<>();
//            list.addAll(Arrays.asList(34, 35, 32, 11, 22));
            List<Worker> list = new ArrayList<>();
            list.add(new Worker("Anton", 800, new Address("Lviv")));
            list.add(new Worker("Petro", 2000, new Address("NY")));
            oos.writeObject(list);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (
                FileInputStream fis = new FileInputStream("aa");
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
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
