package Test_Check_4;

public class Concessionaria {
    private NomeConcessionaria nomeConcessionaria;
    private Auto[] listaAuto = new Auto[10];
    private int numeroAuto = 0;

    public Concessionaria(NomeConcessionaria nomeConcessionaria) {
        this.nomeConcessionaria = nomeConcessionaria;
    }

    public NomeConcessionaria getNomeConcessionaria() {
        return nomeConcessionaria;
    }

    public void setNomeConcessionaria(NomeConcessionaria nomeConcessionaria) {
        this.nomeConcessionaria = nomeConcessionaria;
    }

    public Auto[] getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(Auto[] listaAuto) {
        this.listaAuto = listaAuto;
    }

    public void aggiungiAuto(Auto auto) {
        if (numeroAuto < listaAuto.length) {
            listaAuto[numeroAuto++] = auto;
            System.out.println("Auto aggiunta con successo all'inventario.");
        } else {
            System.out.println("L'inventario è pieno.");
        }
    }

    public void mostraInventario() {
        System.out.println("Inventario delle auto:");
        for (int i = 0; i < numeroAuto; i++) {
            System.out.println(listaAuto[i]);
            if (listaAuto == null) {
                System.out.println("Auto finite");
                break;
            }
        }
    }

    public void rimuoviAuto(Auto auto) {
        for (int index = 0; index < listaAuto.length; index++) {
            if (listaAuto[index] == auto) {
                listaAuto[index] = null;
                break;
            }
        }
    }

}
