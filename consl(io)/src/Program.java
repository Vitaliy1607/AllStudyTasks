import java.io.*;

public class Program {

    static Library library;

    public static void main(String[] args) {
        initLibrary();


        System.out.println(library.getAuthors());
        System.out.println(library.getBooks());



        save(library);

    }

    private static void initLibrary() {
        File file = new File("backup");
        if (file.exists()) {
            try (
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis);
            ) {
                Object o = ois.readObject();
                if (o instanceof Library) {
                    library = (Library) o;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (EOFException e) {
                library = new Library();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            library = new Library();
        }
    }

    private static void save(Library library) {
        try (
                FileOutputStream fos = new FileOutputStream("backup");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(library);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
