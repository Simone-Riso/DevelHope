package Exceptions_1;

public class Main {
    public static void main(String[] args) {
        int limiteInferiore = 0;
        int limiteSuperiore = 10;
        int numero = 5;

        try {
            System.out.println("Il numero è nel range: " + nelRange(numero, limiteInferiore, limiteSuperiore));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean nelRange(int numero, int limiteInferiore, int limiteSuperiore) {
        if (numero >= limiteInferiore && numero <= limiteSuperiore) {
            return true;
        } else {
            throw new IllegalArgumentException("Il numero non rientra nel range tra " + limiteInferiore + " e " + limiteSuperiore);
        }
    }
}
