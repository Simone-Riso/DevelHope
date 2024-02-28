package Oggetti_costruttore_getter_setter_2;

public class Main {
    public static void main(String[] args) {
        Auto a = new Auto(1000, "GA129KM", "Fiat Panda", "blablka");
        System.out.println("Informazioni autovettura:");
        System.out.println("La cilindrata della macchina è: " + a.getCilindrata());
        System.out.println("La targa della macchina è: " + a.getTarga());
        System.out.println("Il modello della macchina è: " + a.getModello());
        System.out.println("La marca della macchina è: " + a.getMarca());
    }
}
