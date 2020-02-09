import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream(file, true);
        for (int i = 0; i < 128; i++) {
            fos.write(i);
        }
        fos.close();


//        FileInputStream fis = new FileInputStream(file);
//        int b;
//        while ((b = fis.read()) != -1) {
//            System.out.println((char) b);
//        }
//        fis.close();
    }
}
