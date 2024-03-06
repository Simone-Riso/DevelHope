package Enum;

enum TipoForma {
    TRIANGOLO,
    RETTANGOLO,
}

public class Forma {
    private TipoForma tipo;

    public TipoForma getTipo() {
        return tipo;
    }

    public void setTipo(TipoForma tipo) {
        this.tipo = tipo;
    }

    public double calcolaArea() {
        System.out.println("Calcolo area forma: ");
        return 0.0;
    }
}
