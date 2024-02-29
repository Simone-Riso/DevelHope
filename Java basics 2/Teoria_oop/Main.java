package Teoria_oop;

public class Main {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo();
        articolo1.nome = "Pizza";
        articolo1.prezzo = 4.99;

        Articolo articolo2 = new Articolo();
        articolo2.nome = "Acqua";
        articolo2.prezzo = 0.99;

        System.out.println("Articolo 1: " + articolo1);
        System.out.println("Articolo 2: " + articolo2);

        Carrello carrello = new Carrello();
        carrello.articoli = new Articolo[] {articolo1, articolo2};
        carrello.totale = articolo1.prezzo + articolo2.prezzo;

        System.out.println("Carrello: " + carrello);
    }
}
