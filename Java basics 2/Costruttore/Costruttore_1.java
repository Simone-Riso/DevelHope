package Costruttore;

public class Costruttore_1 {
    public static void main(String[] args) {
        Studente s = new Studente("Simone", "Riso");
        System.out.println("Lo studente si chiama: " + s.getNome() + " , " + s.getCognome() + " , " + s.getId());
    }
}
