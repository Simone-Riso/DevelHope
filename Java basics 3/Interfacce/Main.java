package Interfacce;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 2);
        System.out.println("Area rettangolo = " + rettangolo.calcolaArea());
        Triangolo triangolo = new Triangolo(3, 5);
        System.out.println("Area triangolo = " + triangolo.calcolaArea());
    }
}
