package Test_Check_3;

public class Corso {
    NomeCorso nomeCorso;
    int creditiFormativi;
    Studente[] studentiIscritti = new Studente[18];

    public Corso(NomeCorso nomeCorso, int creditiFormativi) {
        this.nomeCorso = nomeCorso;
        this.creditiFormativi = creditiFormativi;
    }

    public NomeCorso getNomeCorso() {
        return nomeCorso;
    }

    public void setNomeCorso(NomeCorso nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public int getCreditiFormativi() {
        return creditiFormativi;
    }

    public void setCreditiFormativi(int creditiFormativi) {
        this.creditiFormativi = creditiFormativi;
    }

    public Studente[] getStudentiIscritti() {
        return studentiIscritti;
    }

    public void setStudentiIscritti(Studente[] studentiIscritti) {
        this.studentiIscritti = studentiIscritti;
    }

    public void numStudenti() {
        for (Studente studente : studentiIscritti) {
            System.out.println("Studenti iscritti: " + studente);
            if (studente == null) {
                System.out.println("Studenti sono scappati");
            }
        }
    }

    public void addStudente(Studente studente) {
        for (int i = 0; i < studentiIscritti.length; i++) {
            if (studentiIscritti[i] == null) {
                studentiIscritti[i] = studente;
                break;
            }
        }
    }

}
