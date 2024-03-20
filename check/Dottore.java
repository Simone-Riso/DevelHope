package check;

public class Dottore {
    private String ID;
    private String nome;
    private String cognome;
    private int anniEsperienza;
    private String[] pazienti = new String[200];
    private Enum specializzazione;

    public Dottore(String iD, String nome, String cognome, int anniEsperienza, Enum specializzazione) {
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

    public void aggiungiPaziente(String nomeCognome) {
        for (int i = 0; i < pazienti.length; i++) {
            if (pazienti[i] == null) {
                pazienti[i] = nomeCognome;
            }
        }
    }

    public void ricercaPaziente(String inputToSearch) {
        for (int i = 0; i < pazienti.length;) {
            if (pazienti[i] == inputToSearch) {
                System.out.println("Paziente" + " " + inputToSearch + " " + "presente");
            } else {
                System.out.println("Paziente non presente");
            }
            break;
        }
    }

    public void nomeDottore() {
        System.out.println("Dottor : " + nome + " " + cognome);
        System.out.println("Specializzazione: " + specializzazione);
        for (int i = 0; i < pazienti.length;) {
            System.out.println("Pazienti: " + pazienti[i]);
            break;
        }
    }
}
