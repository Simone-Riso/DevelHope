public class Operatori_di_comparazione_1 {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;

        System.out.println("Numero 1 = " + numero1);
        System.out.println("Numero 2 = " + numero2);
        System.out.println("I due numeri sono diversi? " + confrontaNumeri(numero1, numero2));
    }

    public static boolean confrontaNumeri(int num1, int num2) {
        return num1 != num2;
    }
}
