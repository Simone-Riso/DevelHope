package Exceptions_3;

public class Main {
    public static void main(String[] args) {
        provaDivisione(10, 0);
    }

    public static void provaDivisione(int numero1, int numero2) {
        try {
            int result = numero1 / numero2;
            System.out.println("Il risultato della divisione è: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
