public class Samosa {
    private static Samosa samosa;

    // Constructor
    private Samosa() {

    }

    // Lazy way of creating single object - It won't create object until first call.
    public static Samosa getSamosa() {

        if (samosa == null) {
            samosa = new Samosa();
        }

        return samosa;
    }
}