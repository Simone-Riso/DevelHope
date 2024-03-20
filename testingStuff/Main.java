package testingStuff;

class Film {
    private String titolo;
    private String regista;
    private int annoUscita;
    private String genere;

    public Film(String titolo, String regista, int annoUscita, String genere) {
        this.titolo = titolo;
        this.regista = regista;
        this.annoUscita = annoUscita;
        this.genere = genere;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public int getAnnoUscita() {
        return annoUscita;
    }

    public void setAnnoUscita(int annoUscita) {
        this.annoUscita = annoUscita;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Film: " + titolo + ", regista: " + regista + ", annoUscita: " + annoUscita + ", genere: " + genere;
    }

    
}

class Noleggio {
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

public class Main {
    public static void main(String[] args) {
        Noleggio noleggio = new Noleggio();

        noleggio.aggiungiFilm(new Film("Interstellar", "Christopher Nolan", 2014, "Fantascienza"));
        noleggio.aggiungiFilm(new Film("Inception", "Christopher Nolan", 2010, "Azione"));

        noleggio.mostraInventario();
    }
}
