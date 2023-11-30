package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        Cat myCat = new Cat("Stella", 6);

        Field[] catFields = myCat.getClass().getDeclaredFields();

        for (Field field: catFields) {
            //System.out.println(field.getName());
            // we can change the name of our cat
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "Jimmy");
            }
        }
        System.out.println(myCat.getName());

        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        for (Method method: catMethods) {
//            System.out.println(method.getName());
//            if (method.getName().equals("heyThisIsPrivate")) {
//                method.setAccessible(true);
//                // exe the method
//                method.invoke(myCat);
//            }

            if (method.getName().equals("thisIsAPublicStaticMethod")) {
                method.setAccessible(true);
                // exe the method
                method.invoke(null);
            }
        }

    }
}
