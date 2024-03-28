package Test_Check_1;

public class Noleggio {
    private Film[] inventario = new Film[500];
    private int numFilm = 0;

    public void aggiungiFilm(Film film) {
        if (numFilm < 500) {
            inventario[numFilm++] = film;
            System.out.println("Film aggiunto con successo all'inventario.");
        } else {
            System.out.println("L'inventario è pieno.");
        }
    }

    public void mostraInventario() {
        System.out.println("Inventario dei film:");
        for (int i = 0; i < numFilm; i++) {
            System.out.println(inventario[i]);
        }
    }

}