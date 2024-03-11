package TeoriaBasics2;

public class Main {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo("Pizza", 4.99);

        Articolo articolo2 = new Articolo("Acqua", 0.99);

        System.out.println("Articolo 1: " + articolo1);
        System.out.println("Articolo 2: " + articolo2);

        Carrello carrello = new Carrello(new Articolo[]{articolo1, articolo2});

        System.out.println("Carrello: " + carrello);
    }
}
