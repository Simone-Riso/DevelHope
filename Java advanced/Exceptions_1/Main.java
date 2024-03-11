package Exceptions_1;

public class Main{
    public static void main(String[] args) {
        int minimo = 0;
        int massimo = 10;
        int numero1 = 6;
        System.out.println("Il numero è nel range: " + nelRange(numero1, minimo, massimo));
    }

    public static boolean nelRange(int numero1, int minimo, int massimo) {
        if (numero1 >= minimo && numero1 <= massimo) {
            return true;
        } else {
            throw new ArithmeticException("Il numero non rientra nel range tra " + minimo + " e " + massimo);
        }
    }
}
