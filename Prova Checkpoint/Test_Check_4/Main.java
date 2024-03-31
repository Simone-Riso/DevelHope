package Test_Check_4;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("BMW", "Boh1", 2999.99);
        Auto auto2 = new Auto("FORD", "Boh2", 1999.99);
        Auto auto3 = new Auto("PANDA", "Boh3", 4999.99);

        Concessionaria concessionaria = new Concessionaria(NomeConcessionaria.AUTOCLUB);
        concessionaria.aggiungiAuto(auto1);
        concessionaria.aggiungiAuto(auto2);
        concessionaria.aggiungiAuto(auto3);

        concessionaria.rimuoviAuto(auto3);

        concessionaria.mostraInventario();


    }
}
