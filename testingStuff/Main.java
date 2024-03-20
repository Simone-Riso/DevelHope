package testingStuff;

public class Main {
    public static void main(String[] args) {
        Noleggio noleggio = new Noleggio();

        noleggio.aggiungiFilm(new Film("Interstellar", "Christopher Nolan", 2014, "Fantascienza"));
        noleggio.aggiungiFilm(new Film("Inception", "Christopher Nolan", 2010, "Azione"));

        noleggio.mostraInventario();
    }
}
