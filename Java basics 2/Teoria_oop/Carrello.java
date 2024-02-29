package Teoria_oop;

import java.util.Arrays;

public class Carrello {
    private double totale;
    private Articolo[] articoli;

    public Carrello(Articolo[] articoli) {
        this.articoli = articoli;
        calcolaTotale();
    }

    public double getTotale() {
        return totale;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
        this.totale = 0.0;
        calcolaTotale();
    }

    private void calcolaTotale() {
        totale = 0;
        for (int i = 0; i < articoli.length; i++) {
            totale += articoli[i].getPrezzo();
        }
    }

    @Override
    public String toString() {
        return "Carrello [Il totale è: " + totale + ", articoli = " + Arrays.toString(articoli) + "]";
    }
}
