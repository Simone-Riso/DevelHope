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
        System.out.println("\n" + "Lista studenti iscritti al corso di | " + getNomeCorso() + " | con crediti formativi massimi pari a | " + getCreditiFormativi() + " |:");
        for (int i = 0; i < studentiIscritti.length; i++) {
            if (studentiIscritti[i] == null) {
                break;
            } else {
                System.out.println(studentiIscritti[i]);
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

    public void ricercaNumMatricola(Integer numeroMatricola) {
        System.out.println("\n" + "Ricerca matricola numero: | " + numeroMatricola + " | in corso...");
        boolean matricolaTrovata = false;
        for (Studente studente : studentiIscritti) {
            if (studente != null && studente.getNumMatricola().equals(numeroMatricola)) {
                matricolaTrovata = true;
                System.out.println("Matricola trovata: " + studente);
            }
        }

        if (!matricolaTrovata) {
            System.out.println("Matricola non trovata " + numeroMatricola);
        }
    }

}
