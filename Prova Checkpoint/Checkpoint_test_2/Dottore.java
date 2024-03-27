package Checkpoint_test_2;

import java.util.Arrays;

public class Dottore {
    private String ID;
    private String nome;
    private String cognome;
    private int anniEsperienza;
    private String[] pazienti = new String[200];
    private Specializzazione specializzazione;

    public Dottore(String iD, String nome, String cognome, int anniEsperienza, Specializzazione specializzazione) {
        ID = iD;
        this.nome = nome;
        this.cognome = cognome;
        this.anniEsperienza = anniEsperienza;
        this.specializzazione = specializzazione;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getAnniEsperienza() {
        return anniEsperienza;
    }

    public void setAnniEsperienza(int anniEsperienza) {
        this.anniEsperienza = anniEsperienza;
    }

    public String[] getPazienti() {
        return pazienti;
    }

    public void setPazienti(String[] pazienti) {
        this.pazienti = pazienti;
    }

    public Specializzazione getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(Specializzazione specializzazione) {
        this.specializzazione = specializzazione;
    }

    public void aggiungiPaziente(String nomeCognome) {
        for (int i = 0; i < pazienti.length; i++) {
            if (pazienti[i] == null) {
                pazienti[i] = nomeCognome;
                break;
            }
        }
    }

    public void ricercaPaziente(String inputToSearch) {
        for (String paziente : pazienti) {
            if (paziente != null && paziente.contains(inputToSearch)) {
                System.out.println("Paziente" + " " + paziente + " " + "presente");
            } else if (!Arrays.toString(pazienti).contains(inputToSearch)) {
                System.out.println("Paziente" + " " + inputToSearch + " " + "non presente");
                break;
            }
        }
    }

    public void nomeDottore() {
        System.out.println("Dottor : " + nome + " " + cognome);
        System.out.println("Specializzazione: " + specializzazione);
        for (int i = 0; i < pazienti.length; i++) {
            if (pazienti[i] == null) {
                break;
            } else {
                System.out.println("Pazienti: " + pazienti[i]);
            }
        }
    }
}
