import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();

    @org.junit.jupiter.api.Test
    void dataFormattata() {
        ZonedDateTime oggi = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        String exp = "01 marzo 2023";
        String result = testing.dataFormattata(oggi);

        assertEquals(exp, result, "Il risultato dovrebbe essere 01 marzo 2023");

    }

    @Test
    void dataNul(){
        ZonedDateTime date = null;
        String result = testing.dataFormattata(date);
        assertNull(result, "Il risultato è Null");
    }

}