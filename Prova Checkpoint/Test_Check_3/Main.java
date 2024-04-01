package Test_Check_3;

public class Main {
    public static void main(String[] args) {
        Corso corso1 = new Corso(NomeCorso.INGLESE, 20);
        
        corso1.addStudente(new Studente(161001, "Simone", "Riso", "Via yuhahby"));
        corso1.addStudente(new Studente(161002, "Emiliano", "Riso", "Via lghskjnbkj"));
        corso1.addStudente(new Studente(161003, "Carlo", "Riso", "Via abckbkfb"));

        corso1.numStudenti();

        corso1.ricercaNumMatricola(161002);
    }
    
}
