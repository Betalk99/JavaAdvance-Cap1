public class Triangolo extends Forma{
    private Double base;
    private Double altezza;
    private TipoForma tipo;

    // Costruttore
    public Triangolo(Double base, Double altezza, TipoForma tipo) {
        this.tipo = tipo;
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public Double calcolaArea(){
        return base*altezza / 2;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", tipo=" + tipo +
                '}';
    }
}
