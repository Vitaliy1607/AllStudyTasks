package pg;

import java.lang.reflect.Field;

public class Analizer {

    public static <T> void analize(T o) throws IllegalAccessException {
        Class<?> clz = o.getClass();

        for (Field field : clz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Email.class)) {

                field.setAccessible(true);
                String o1 = (String) field.get(o);
                if (!o1.contains("@")) {
                    throw new RuntimeException("email is not valid");
                }
            } else if (field.isAnnotationPresent(Random.class)) {
                field.setAccessible(true);
                if (field.getType().equals(int.class)) {
                    field.setInt(o, (int) (Math.random() * 100));
                }
            }


        }
    }
}
