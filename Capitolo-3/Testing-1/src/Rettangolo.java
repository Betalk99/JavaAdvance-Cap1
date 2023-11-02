public class Rettangolo extends Forma{
    private Double base;
    private Double altezza;
    private TipoForma tipo;

    // Costruttore
    public Rettangolo(Double base, Double altezza, TipoForma tipo) {
        this.tipo = tipo;
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public Double calcolaArea(){
        if(base == null || altezza == null){
            return null;
        }
        return base*altezza;
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
