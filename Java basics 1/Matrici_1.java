public class Matrici_1 {
    public static void main(String[] args) {
        int[][] matrice = inizializzaMatrice(3, 4);

        System.out.println("Matrice inizializzata:");
        stampaMatrice(matrice);

        System.out.println("Somma della prima riga: " + sommaPrimaRiga(matrice));
    }

    public static int[][] inizializzaMatrice(int righe, int colonne) {
        int[][] matrice = new int[righe][colonne];
        int valore = 1;
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                matrice[i][j] = valore++;
            }
        }
        return matrice;
    }

    public static void stampaMatrice(int[][] matrice) {
        for (int[] riga : matrice) {
            for (int elemento : riga) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static int sommaPrimaRiga(int[][] matrice) {
        int somma = 0;
        for (int j = 0; j < matrice[0].length; j++) {
            somma += matrice[0][j];
        }
        return somma;
    }
}
