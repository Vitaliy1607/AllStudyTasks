import java.io.*;

public class Program2 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("f1.txt");
            fw.write("Hello there\n");
            fw.write("My name\n");
            fw.write("is Roman\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (
                FileReader fr = new FileReader("f1.txt");
                BufferedReader br = new BufferedReader(fr);
        ) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
