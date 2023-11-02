import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RettangoloTest {

    private final Rettangolo testing = new Rettangolo(Double.valueOf(3),Double.valueOf(5), TipoForma.rettangolo);


    @org.junit.jupiter.api.Test
    void calcolaArea() {
        Double result = testing.calcolaArea();
        assertEquals(15, result, "Area di 3*5 dovrebbe essere 15");

    }

    @Test
    void calcolaAreaNull(){
        Double result = testing.calcolaArea();
        assertNull(result, "Uno dei due numeri è null");
    }

}