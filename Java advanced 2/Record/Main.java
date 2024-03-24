package Record;

public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(10, 20);

        System.out.println("x: " + punto1.x());
        System.out.println("x: " + punto1.y());
        System.out.println("Punto: " + punto1);

        Punto punto2 = new Punto(5, 10);
        System.out.println("I due punti sono uguali: " + punto1.equals(punto2));
    }
}
