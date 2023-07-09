public class Jalebi {
    // Eager Way of singleton obeject
    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getJalebi() {
        return jalebi;
    }
}