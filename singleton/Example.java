import java.lang.reflect.Constructor;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;


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

//        Samosa s1 = Samosa.getSamosa();
//        System.out.println(s1.hashCode());
//
//        // CREATE OBJECT VIA ENUM
//        Samosa s1 = Samosa.INSTANCE;
//        System.out.println(s1.hashCode());
//        s1.test();

//        // MODIFING CLASS ON RUNTIME - REFLECTION API
//        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor(); // Get constructor reference
//        constructor.setAccessible(true);
//        Samosa s3 = constructor.newInstance();
//        System.out.println(s3.hashCode());


//        // DESERIALIZATION
//        Samosa s1 = Samosa.getSamosa();
//        System.out.println(s1.hashCode());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(s1);
//        System.out.println("Serialization done..");
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//        Samosa s2 = (Samosa) ois.readObject();
//
//        System.out.println(s2.hashCode());

        // OBJECT CLONING
        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());

        Samosa s2 = (Samosa) s1.clone();
        System.out.println(s2.hashCode());
    }
}