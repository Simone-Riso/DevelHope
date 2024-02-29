package Oggetti_costruttore_getter_setter_2;

public class Main {
    public static void main(String[] args) {
        Auto a = new Auto(1500, "FT645PC", "Ford", "Focus ST Line 125cv co pilot S&S");
        System.out.println("Informazioni autovettura:");
        System.out.println("La cilindrata della macchina è: " + a.getCilindrata());
        System.out.println("La targa della macchina è: " + a.getTarga());
        System.out.println("La marca della macchina è: " + a.getMarca());
        System.out.println("Il modello della macchina è: " + a.getModello());
    }
}
