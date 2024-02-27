package If_statement;
public class If_statement_2 {
    public static void main(String[] args) {
        String str = "Hello, world!";
        int lunghezza = calcolaLunghezza(str);

        if (lunghezza > 10) {
            System.out.println("Lunghezza maggiore di 10");
        } else if (lunghezza < 10) {
            System.out.println("Lunghezza minore di 10");
        } else {
            System.out.println("Lunghezza pari a 10");
        }
    }

    public static int calcolaLunghezza(String str) {
        int lunghezza = 0;

        for (int i = 0; i < str.length(); i++) {
            lunghezza++;
        }
        return lunghezza;
    }
}
