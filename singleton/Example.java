import java.lang.reflect.Constructor;

public class Example {
    public static void main(String[] args) throws Exception {
//        Samosa samosa = Samosa.getSamosa();
//        System.out.println(samosa.hashCode());
//        Samosa samosa2 = Samosa.getSamosa();
//        System.out.println(samosa2.hashCode());
//
//        Jalebi jalebi = Jalebi.getJalebi();
//        System.out.println(jalebi.hashCode());
//        Jalebi jalebi2 = Jalebi.getJalebi();
//        System.out.println(jalebi2.hashCode());

        /*
        * 1. Reflection API to Break Singleton Pattern
        * Solution 1: if object is there - throw exception
        * Solution 2: Use enum
        *
        *
        *
        * */

        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());

        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor(); // Get constructor reference
        constructor.setAccessible(true);
        Samosa s2 = constructor.newInstance();
        System.out.println(s2.hashCode());
    }
}