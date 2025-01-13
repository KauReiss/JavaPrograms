public class Main {
    public static void main(String[] args) throws Exception {
        Raw s1 = new Raw("Dolph Zigler", "Canadá", 32, 1.79f, 78.3f);
        Smackdown s2 = new Smackdown("Undertaker", "EUA", 48, 1.93f, 98.3f);

        s1.apresentar();
        s2.apresentar();
    }
}
