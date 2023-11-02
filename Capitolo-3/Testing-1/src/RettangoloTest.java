import static org.junit.jupiter.api.Assertions.*;

class RettangoloTest {

    private final Rettangolo testing = new Rettangolo(3,5, TipoForma.rettangolo);


    @org.junit.jupiter.api.Test
    void calcolaArea() {
        double result = testing.calcolaArea();
        assertEquals(15, result, "Area di 3*5 dovrebbe essere 15");

    }
}