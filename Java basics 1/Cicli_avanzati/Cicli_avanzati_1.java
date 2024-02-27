package Cicli_avanzati;
public class Cicli_avanzati_1 {
    public static void main(String[] args) {
        int valore = 10;
        stampaNumeri(valore);
    }

    public static void stampaNumeri(int valore) {
        for (int i = 1; i <= valore; i++) {
            if (i == 5) {
                System.out.println("Interrotto perché valore uguale a 5.");
                break;
            }
            System.out.println(i);
        }
    }
}
