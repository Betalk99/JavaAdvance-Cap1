public class Triangolo extends Forma{
    private double base;
    private double altezza;
    private TipoForma tipo;

    // Costruttore
    public Triangolo(double base, double altezza, TipoForma tipo) {
        this.tipo = tipo;
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea(){
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
