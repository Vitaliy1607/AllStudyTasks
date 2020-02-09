import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Program4 {
    public static void main(String[] args) {
        InputStream is = null;
        FileOutputStream fos = null;

        try {
            URL url = new URL("https://bipbap.ru/wp-content/uploads/2017/04/leto_derevo_nebo_peyzazh_dom_derevya_domik_priroda_3000x2000.jpg");
            is = url.openStream();
            fos = new FileOutputStream("img.png");

            int b;
            while((b = is.read())!= -1){
               fos.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is!= null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if((fos!=null)){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
