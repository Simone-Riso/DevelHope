public class Funzioni_2 {
    public static void main(String[] args) {
        String inputString = "Ciao";
        int length = calcoLaLunghezza(inputString);
        System.out.println("La lunghezza della stringa è: " + length);
    }

    public static int calcoLaLunghezza(String inputString) {
        return inputString.length();
    }
}
