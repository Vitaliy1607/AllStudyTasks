package pg;

import Random.Random;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

public class Program {

    public static void main(String[] args) throws Exception {
        User anton22 = new User("anton@gmail.com" , "12345", 22);
        Class<User> clazz = User.class;
        Class<?> clz = anton22.getClass();
//
//        System.out.println(clazz);
//        System.out.println(clz);
//        System.out.println(clz.equals(clazz));
//        for (Field field : clz.getDeclaredFields()) {
//            System.out.println(field);
//            if (!field.isAccessible()) {
//                field.setAccessible(true);
//                System.out.println(field.get(user));
//                field.setAccessible(false);
//            }else {
//            System.out.println(field.get(user));}
//        }

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        Field field = clazz.getDeclaredField(br.readLine());
//        field.setAccessible(true);
//        field.set(anton22, br.readLine());
//        System.out.println(anton22);

//        Class<?> aClass = Class.forName(br.readLine());
//        Object o = aClass.newInstance();
//        System.out.println(o);

        User user1 = new User("" , "dad" , 33);

        Analizer.random(user1);

    }
}
