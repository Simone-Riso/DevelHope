package check;

public class SettoreOspedaliero {
    String identificativo;
    String nome;
    String dottori;

    public SettoreOspedaliero(String identificativo, String nome, String dottori) {
        this.identificativo = identificativo;
        this.nome = nome;
        this.dottori = dottori;
    }

    public String getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(String identificativo) {
        this.identificativo = identificativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDottori() {
        return dottori;
    }

    public void setDottori(String dottori) {
        this.dottori = dottori;
    }
}
