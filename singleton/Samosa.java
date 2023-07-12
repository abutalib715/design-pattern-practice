import java.io.Serializable;
import java.lang.Cloneable;

public class Samosa implements Serializable, Cloneable {
    private static Samosa samosa;

    // Constructor
    private Samosa() {
        if(samosa != null){
            throw new RuntimeException("You are trying to break singleton pattern!");
        }
    }

    // Lazy way of creating single object - It won't create object until first call.
    public static Samosa getSamosa() {

        if (samosa == null) {
            // THREAD SAFETY - This block will not execute at the same time on thread
            synchronized (Samosa.class) {
                if (samosa == null) {
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }

    // PREVENTING DESERIALIZATION SINGLETON BREAK ISSUE
    public Object readResolve(){
        return samosa;
    }

    public Object clone() throws CloneNotSupportedException{
        return samosa;
    }



}


//// CREATE OBJECT VIA ENUM
//public enum Samosa {
//    INSTANCE;
//
//    public void test(){
//        System.out.println("Hello, testing!");
//    }
//}