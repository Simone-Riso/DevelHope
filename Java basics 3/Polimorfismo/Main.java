package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        forma.calcolaArea();
        Rettangolo rettangolo = new Rettangolo(5, 2);
        rettangolo.calcolaArea();
        Triangolo triangolo = new Triangolo(3, 5);
        triangolo.calcolaArea();
    }
}
