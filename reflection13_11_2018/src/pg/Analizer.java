package pg;

import Random.Random;

import java.io.InputStream;
import java.lang.reflect.Field;

public class Analizer {
   static java.util.Random rnd = new java.util.Random();
    public static <T> void analize(T o) throws IllegalAccessException {
        Class<?> clz = o.getClass();
        for (Field field : clz.getDeclaredFields()) {
            field.setAccessible(true);
            String o1 = (String) field.get(o);
            if (!o1.contains("@")){
                throw new RuntimeException("email is not validate");
            }
        }
    }
    public static <N> void random(N n) throws IllegalAccessException {
        Class<?> nClass = n.getClass();
        for (Field field : nClass.getDeclaredFields()) {
            field.setAccessible(true);
            int age = rnd.nextInt(300);
            if (age > 70){
                throw new RuntimeException("age is not validate");
            }
        }
    }
}
