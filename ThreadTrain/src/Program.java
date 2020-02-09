import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        InputStreamReader isr = null;
        int c = 0;                     // БАЙТОВІ ПОТОКИ

        try {
            fis = new FileInputStream("Hello.txt");

            while ((c = fis.read())!= -1){
            System.out.println((char) c);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis != null){
                fis.close();
            }
        }
    }
}
