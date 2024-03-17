package Exceptions_4;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        provaDivisione(array);
    }

    public static void provaDivisione(int[] array) {
            try {
                int result = array[6] / 0;
                System.out.println("Risultato: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
            }
        }
    }
