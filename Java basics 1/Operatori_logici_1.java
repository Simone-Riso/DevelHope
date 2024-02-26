public class Operatori_logici_1 {
    public static void main(String[] args) {
        int loweBound = 1;
        int upperBound = 3;
        int value = 4;
        
        System.out.println("Limite inferiore: " + loweBound);
        System.out.println("Limite superiore: " + upperBound);
        System.out.println("Valore di confronto: " + value);
        System.out.println("Il valore è contenuto: " + isContained(loweBound, upperBound, value));

    }

    public static boolean isContained(int loweBound, int upperBound, int value) {
        return (value >= loweBound) && (value <= upperBound);
    }
}
