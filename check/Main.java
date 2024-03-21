package check;

public class Main {
    public static void main(String[] args) {
        Dottore dottore1 = new Dottore("16102001", "Simone", "Riso", 10, specializzazione.CARDIOLOGO);
        Dottore dottore2 = new Dottore("16102001", "Emiliano", "Riso", 10, specializzazione.CHIRURGO);
        Dottore dottore3 = new Dottore("16102001", "Francesco", "Riso", 10, specializzazione.GINECOLOGO);
        Dottore dottore4 = new Dottore("16102001", "Gianluca", "Riso", 10, specializzazione.PEDIATRA);

        dottore1.aggiungiPaziente("Paolo");
        dottore1.aggiungiPaziente("Daniel");
        dottore1.aggiungiPaziente("Valerio");

        dottore1.ricercaPaziente("Daniel");

        dottore1.nomeDottore();
        // dottore2.nomeDottore();
        // dottore3.nomeDottore();
        // dottore4.nomeDottore();

    }
}
