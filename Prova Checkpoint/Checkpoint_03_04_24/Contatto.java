package Checkpoint_03_04_24;

public class Contatto {
    private String nome;
    private String cognome;
    private String numTelefono;
    private String email;

    public Contatto(String nome, String cognome, String numTelefono, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.numTelefono = numTelefono;
        this.email = email;
    }

    public Contatto(String numTelefono, String nome) {
        this.numTelefono = numTelefono;
        this.nome = nome;
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

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contatto [nome=" + nome + ", cognome=" + cognome + ", numTelefono=" + numTelefono + ", email=" + email
                + "]";
    }

}
