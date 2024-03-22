package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> listaFrutta = new LinkedList<>();
        listaFrutta.add(new Fruit("Banana"));
        listaFrutta.add(new Fruit("Mela"));
        listaFrutta.add(new Fruit("Ananas"));

        System.out.println("Lista di frutta: ");
        for (Fruit fruit : listaFrutta) {
            System.out.println(fruit);
        }
        
        System.out.println("Lista di frutta aggiornata: ");
        listaFrutta.addFirst(new Fruit("Mango"));
        listaFrutta.addLast(new Fruit("Uva"));

        for (Fruit fruit : listaFrutta) {
            System.out.println(fruit);
        }

    }
}
