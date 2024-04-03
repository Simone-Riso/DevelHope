package Checkpoint_03_04_24;

public class Main {
    public static void main(String[] args) {
        Contatto contatto1 = new Contatto("Simone", "Riso", "3802645433", "blablabla@gmail.com");
        Contatto contatto2 = new Contatto("Emiliano", "Riso", "38165165", "blablabla@gmail.com");
        Contatto contatto3 = new Contatto("Carlo", "Riso", "38165165", "blablabla@gmail.com");

        Rubrica rubrica1 = new Rubrica();

        rubrica1.addContatto(contatto1);
        rubrica1.addContatto(contatto2);
        rubrica1.addContatto(contatto3);

        rubrica1.removeContatto(contatto2);

        rubrica1.stampaRubrica();

        rubrica1.ricercaPerContatto("Simone");

    }

}
