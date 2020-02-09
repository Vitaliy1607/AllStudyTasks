import java.io.*;

public class Program2 {
    public static void main(String[] args) {
     //   FileOutputStream fos = null;
        String str = " bmw its a power";  // СИМВОЛЬНІ ПОТОКИ
        FileWriter fw = null;
        File file = new File("bmw.txt");

        try {
            fw = new FileWriter(file , true);
            fw.write(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
