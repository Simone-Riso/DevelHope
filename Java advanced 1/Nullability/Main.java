package Nullability;

public class Main {
    public static void main(String[] args) {
        Integer numeratore = 10;
        Integer denominatore = 2;

        try {
            int risultato = calcolaDivisione(numeratore, denominatore);
            System.out.println("Il risultato della divisione è: " + risultato);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int calcolaDivisione(Integer numeratore, Integer denominatore) {
        if (numeratore == null || denominatore == null) {
            throw new IllegalArgumentException("Errore: Rilevato input null");
        } else if (denominatore == 0) {
            throw new IllegalArgumentException("Errore: Impossibile dividere per zero");
        }
        return numeratore / denominatore;
    }
}
