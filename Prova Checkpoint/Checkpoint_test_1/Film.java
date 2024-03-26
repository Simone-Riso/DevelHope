package Checkpoint_test_1;

public class Film {
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