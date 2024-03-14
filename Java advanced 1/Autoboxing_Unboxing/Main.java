package Autoboxing_Unboxing;

public class Main {
    public static void main(String[] args) {
        primaFunzione(5, 10, 10, 4.99);
        secondaFunzione('A', 'a');
        terzaFunzione(10, 20, 20, 9.99);
        quartaFunzione('B', 'b');
    }

    public static void primaFunzione(int numero1, int numero2, int numero3, double numero4) {
        System.out.println("Somma int: " + (numero1 + numero2));
        System.out.println("Autoboxing Integer: " + (Integer) numero3);
        System.out.println("Autoboxing Double: " + (Double) numero4);
    }

    public static void secondaFunzione(char carattere1, char carattere2) {
        System.out.println("Stampa char: " + carattere1);
        System.out.println("Autoboxing Character: " + (Character) carattere2);
    }

    public static void terzaFunzione(Integer numero1, Integer numero2, Integer numero3, Double numero4) {
        System.out.println("Somma Integer: " + (numero1 + numero2));
        System.out.println("Unboxing int: " +  (int) numero3);
        System.out.println("Unboxing double: " + (double) numero4);
    }

    public static void quartaFunzione(Character carattere1, Character carattere2) {
        System.out.println("Stanpa Character: " + carattere1);
        System.out.println("Unboxing char: " + (char) carattere2);
    }
}
