package Matrici;
public class Matrici_2 {
    public static void main(String[] args) {
        // Inizializzazione della matrice
        int[][] matrice = inizializzaMatrice(2, 3);
        System.out.println("Matrice di partenza:");
        stampaMatrice(matrice);

        // Scambio delle righe con le colonne
        int[][] matriceScambiata = scambiaRigheColon(matrice);
        System.out.println("\nMatrice risultato:");
        stampaMatrice(matriceScambiata);
    }

    // Metodo per inizializzare la matrice
    public static int[][] inizializzaMatrice(int righe, int colonne) {
        int[][] matrice = new int[righe][colonne];
        int valore = 1;

        // Riempimento della matrice con valori crescenti
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                matrice[i][j] = valore;
                valore++;
            }
        }

        return matrice;
    }

    // Metodo per scambiare righe e colonne della matrice
    public static int[][] scambiaRigheColon(int[][] matrice) {
        int righe = matrice.length;
        int colonne = matrice[0].length;
        int[][] nuovaMatrice = new int[colonne][righe];

        // Scambio delle righe con le colonne
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                nuovaMatrice[j][i] = matrice[i][j];
            }
        }

        return nuovaMatrice;
    }

    // Metodo per stampare la matrice a video
    public static void stampaMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
