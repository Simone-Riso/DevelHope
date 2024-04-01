package Test_Check_3;

public class Studente {
    Integer numMatricola;
    String nome;
    String cognome;
    String indirizzoResidenza;

    public Studente(int numMatricola, String nome, String cognome, String indirizzoResidenza) {
        this.numMatricola = numMatricola;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzoResidenza = indirizzoResidenza;
    }

    public Studente(Integer numMatricola) {
        this.numMatricola = numMatricola;
    }

    public Integer getNumMatricola() {
        return numMatricola;
    }

    public void setNumMatricola(int numMatricola) {
        this.numMatricola = numMatricola;
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

    public String getIndirizzoResidenza() {
        return indirizzoResidenza;
    }

    public void setIndirizzoResidenza(String indirizzoResidenza) {
        this.indirizzoResidenza = indirizzoResidenza;
    }

    @Override
    public String toString() {
        return "Studente [numMatricola=" + numMatricola + ", nome=" + nome + ", cognome=" + cognome
                + ", indirizzoResidenza=" + indirizzoResidenza + "]";
    }

}
