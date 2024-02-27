package Teoria_Objects;
public class Objects {
    public static void main(String[] args) {
        Articolo article1 = new Articolo();
        article1.nome = "Pizza";
        article1.prezzo = 3.99;

        Articolo article2 = new Articolo();
        article2.nome = "Cola cola";
        article2.prezzo = 1.50;

        System.out.println("Articolo 1: " + article1);
        System.out.println("Articolo 2: " + article2);

        Carrello carrello = new Carrello();
        carrello.articoli = new Articolo[] { article1, article2 };
        carrello.prezzoFinale = article1.prezzo + article2.prezzo;

        System.out.println("Carrello: " + carrello);

    }
}