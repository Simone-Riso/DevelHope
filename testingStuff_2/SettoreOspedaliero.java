package testingStuff_2;

public class SettoreOspedaliero {
    String identificativo;
    String nome;
    Dottore[] dottori = new Dottore[5];

    public SettoreOspedaliero(String identificativo, String nome) {
        this.identificativo = identificativo;
        this.nome = nome;
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

    public Dottore[] getDottori() {
        return dottori;
    }

    public void setDottori(Dottore[] dottori) {
        this.dottori = dottori;
    }

    public void mediaPazienti(SettoreOspedaliero settore) {
        
    }
}
