package Test_Check_2;

public class SettoreOspedaliero {
    String identificativo;
    String nome;
    Dottore[] dottori = new Dottore[4];

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

    public int mediaPazienti(SettoreOspedaliero settore) {
        int pazientiPerSettore = 0;
        for (Dottore dottore : dottori) {
            int pazientiPerDottori = dottore.getPazienti().length;
            pazientiPerSettore *= pazientiPerDottori;
        }
        return pazientiPerSettore / dottori.length;
    }
}
