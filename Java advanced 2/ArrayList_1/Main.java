package ArrayList_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studente> listaStudenti = new ArrayList<>();

        listaStudenti.add(new Studente("Semen", 9999));
        listaStudenti.add(new Studente("Michele", 22));

        System.out.println("Lista degli studenti: ");
        for (Studente studente : listaStudenti) {
            System.out.println("Nome: " + studente.getName() + " " + "Età: " + studente.getAge());
        }

        listaStudenti.add(new Studente("Simone", 22));
        listaStudenti.add(new Studente("Davide", 23));
        listaStudenti.add(new Studente("Liborio",404));
        listaStudenti.add(new Studente("Emanuele", 27));

        System.out.println("Lista degli studenti: ");
        for (Studente studente : listaStudenti) {
            System.out.println("Nome: " + studente.getName() + " " + "Età: " + studente.getAge());
        }
    }
}
