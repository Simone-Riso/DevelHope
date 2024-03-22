package ArrayList_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studente> listaStudenti = new ArrayList<>();
        listaStudenti.add(new Studente("Simone", 22));
        listaStudenti.add(new Studente("Emiliano", 22));
        listaStudenti.add(new Studente("Liborio", 173));
        listaStudenti.add(new Studente("Emanuele", 24));
        
        System.out.println("Lista degli studenti: ");
        for (Studente studente : listaStudenti) {
            System.out.println("Nome: " + studente.getName() + " " + "Età: " + studente.getAge());
        }
    }
}
