package Exceptions_4;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        provaDivisione(array);
    }

    public static void provaDivisione(int[] array) {
        for (int i = 0; i < array.length || i > array.length; i++) {
            try {
                int result = array[i] / 0;
                System.out.println("Risultato: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERRORE: indice dell'array fuori dal range");
                throw e;
            } catch (ArithmeticException e) {
                System.out.println("ERRORE: Divisione per zero");
                throw e;
            }
        }
    }
}
