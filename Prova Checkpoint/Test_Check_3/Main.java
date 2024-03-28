package Test_Check_3;

public class Main {
    public static void main(String[] args) {
        Corso corso1 = new Corso(NomeCorso.INGLESE, 20);
        corso1.addStudente(new Studente(161001, "Simone", "Riso", "Via blablabla"));
    }
}
