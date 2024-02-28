package Costruttore;

public class Auto {
    private int cilindrata;
    private String targa, modello, marca;

    public Auto(int cilindrata, String targa, String modello, String marca) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.modello = modello;
        this.marca = marca;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
