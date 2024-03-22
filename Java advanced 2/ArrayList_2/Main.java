package ArrayList_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studente> listaStudenti = new ArrayList<>();

        listaStudenti.add(new Studente("Studente 1", 22));
        listaStudenti.add(new Studente("Studente 2", 31));
        listaStudenti.add(new Studente("Studente 3", 34));
        listaStudenti.add(new Studente("Studente 4", 17));
        listaStudenti.add(new Studente("Studente 5", 29));
        listaStudenti.add(new Studente("Studente 6", 37));
        listaStudenti.add(new Studente("Studente 7", 15));
        listaStudenti.add(new Studente("Studente 8", 55));
        listaStudenti.add(new Studente("Studente 9", 43));
        listaStudenti.add(new Studente("Studente 10", 18));
        listaStudenti.add(new Studente("Studente 11", 24));
        listaStudenti.add(new Studente("Studente 12", 25));

        Collections.sort(listaStudenti, Comparator.comparingInt(Studente::getAge));

        for (Studente studente : listaStudenti) {
            System.out.println(studente);
        }

    }
}
