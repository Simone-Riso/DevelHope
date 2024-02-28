package Oggetti_costruttore_getter_setter_1;

public class Main {
    public static void main(String[] args) {
        Studente s = new Studente("Simone", "Riso");
        System.out.println("Lo studente si chiama: " + s.getNome() + " , " + s.getCognome() + " , " + s.getId());
    }
}
