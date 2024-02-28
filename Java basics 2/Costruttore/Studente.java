package Costruttore;

import java.util.UUID;

public class Studente {
    private String id, nome, cognome;

    public Studente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

}
