public class Example {
    public static void main(String[] args) {
        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

        Jalebi jalebi = Jalebi.getJalebi();
        System.out.println(jalebi.hashCode());
        Jalebi jalebi2 = Jalebi.getJalebi();
        System.out.println(jalebi2.hashCode());
    }
}