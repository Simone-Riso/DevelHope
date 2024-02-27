package Operatori_logici;
public class Operatori_logici_2 {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println(numero + " è " + (èPari(numero) ? "pari" : "dispari"));
    }

    public static boolean èPari(int numero) {
        return ((numero & 1) == 0);
    }
}
