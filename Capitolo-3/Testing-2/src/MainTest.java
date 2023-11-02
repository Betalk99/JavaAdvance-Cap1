import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();

    @Test
    void dataShor() {
        ZonedDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        String exp = "01/03/02, 13:00";
        String result = testing.dataShor(date);

        assertEquals(exp, result, "risultato dovrebbe essere 01/03/02, 13:00");

    }

    @Test
    void dataNul(){
        ZonedDateTime date = null;
        String result = testing.dataShor(date);
        assertNull(result, "Il risultato è Null");
    }

    @Test
    void dataMed() {
        ZonedDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        String exp = "1 mar 2002, 13:00:00";
        String result = testing.dataMed(date);

        assertEquals(exp, result, "risultato dovrebbe essere 1 mar 2002, 13:00:00");

    }

    @Test
    void dataNulMed(){
        ZonedDateTime date = null;
        String result = testing.dataShor(date);
        assertNull(result, "Il risultato è Null");
    }
    @Test
    void dataFul() {
        ZonedDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        String exp = "venerdì 1 marzo 2002 13:00:00 Ora standard dell’Europa centrale";
        String result = testing.dataFul(date);

        assertEquals(exp, result, "risultato dovrebbe essere venerdì 1 marzo 2002 13:00:00 Ora standard dell’Europa centrale");

    }
    @Test
    void dataNulFull(){
        ZonedDateTime date = null;
        String result = testing.dataShor(date);
        assertNull(result, "Il risultato è Null");
    }






}