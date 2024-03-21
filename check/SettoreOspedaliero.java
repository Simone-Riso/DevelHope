package check;

public class SettoreOspedaliero {
    String identificativo;
    String nome;
    Dottore[] dottori = new Dottore[10];

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

    public void mediaPazienti(SettoreOspedaliero settore) {
        int totaliPazienti = 0;
        int totaliDottori = 0;

        for (int i = 0; i < dottori.length; i++) {
            if (dottori != null) {
                totaliDottori++;
            } for (int j = 0; j < dottori[i].getPazienti().length; j++) {
                
            }
        }
    }
}
