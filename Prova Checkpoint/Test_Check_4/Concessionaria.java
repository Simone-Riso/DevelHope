package Test_Check_4;

public class Concessionaria {
    private NomeConcessionaria nomeConcessionaria;
    private Auto[] listaAuto = new Auto[10];

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
        for (int i = 0; i < listaAuto.length; i++) {
            if (listaAuto[i] == null) {
                listaAuto[i] = auto;
                break;
            }
        }
    }

    public void rimuoviAuto(Auto auto) {
        for (int index = 0; index < listaAuto.length; index++) {
            if (listaAuto[index] == auto) {
                listaAuto[index] = null;
                System.out.println("Un auto è stata venduta: " + auto);
                break;
            }
        }
    }

    public void mostraInventario() {
        System.out.println("Inventario delle auto:");
        for (int i = 0; i < listaAuto.length; i++) {
            if (listaAuto[i] == null) {
                break;
            } else {
                System.out.println(listaAuto[i]);
            }
        }
    }

    public void ricercaMarca(String marca) {
        boolean marcaTrovata = false;
        for (Auto auto : listaAuto) {
            if (auto != null && auto.getMarca().equalsIgnoreCase(marca)) {
                marcaTrovata = true;
                System.out.println("Trovata auto della marca " + marca + ": " + auto);
            }
        }

        if (!marcaTrovata) {
            System.out.println("Nessuna auto trovata della marca: " + marca);
        }
    }

}
