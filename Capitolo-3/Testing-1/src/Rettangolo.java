public class Rettangolo extends Forma{
    private double base;
    private double altezza;
    private TipoForma tipo;

    // Costruttore
    public Rettangolo(double base, double altezza, TipoForma tipo) {
        this.tipo = tipo;
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea(){
        return base*altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public TipoForma getTipo() {
        return tipo;
    }

    public void setTipo(TipoForma tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", tipo=" + tipo +
                '}';
    }
}
