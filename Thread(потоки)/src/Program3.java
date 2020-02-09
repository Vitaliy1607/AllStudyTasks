import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Program3 {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.gettyimages.in/gi-resources/images/Homepage/Hero/US/SEP2016/embed7-601057996.jpg");

        try (
                InputStream is = url.openStream();
                FileOutputStream fos = new FileOutputStream("img.png")
        ) {
            int b;
            while ((b = is.read()) != -1) {
                fos.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
