package Exceptions_2;

public class Main {
    public static void main(String[] args) {
        char numero = 'l';
        check(numero);
    }

    public static void check(char numero) {
        if (Character.isDigit(numero)) {
            System.err.println("Il caratterre passato è un numero: " + numero);
        } else {
            throw new IllegalArgumentException("Il carattere passato non è un numero");
        }
    }
}
