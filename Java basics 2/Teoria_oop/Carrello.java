package Teoria_oop;

import java.util.Arrays;

public class Carrello {
    public double totale;
    public Articolo[] articoli;
    @Override
    public String toString() {
        return "Carrello [Il totale è: " + totale + ", articoli = " + Arrays.toString(articoli) + "]";
    }

    
}
