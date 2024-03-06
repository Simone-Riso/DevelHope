package Classi_astratte;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 10);
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());

        Triangolo triangolo = new Triangolo(3, 4);
        System.out.println("Area del triangolo: " + triangolo.calcolaArea());
    }
}
