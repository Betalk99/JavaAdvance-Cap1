import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();

    @Test
    void ottieniAnno() {
        ZonedDateTime oggi = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        String exp = "2023";
        String result = testing.ottieniAnno(oggi);
        assertEquals(exp, result, "Il risultato dovrebbe essere 2023");
    }

    @Test
    void ottieniAnnoNull(){
        ZonedDateTime oggi = null;
        String result = testing.ottieniAnno(oggi);
        assertNull(result, "Il risultato è Null");
    }

    @Test
    void ottieniMese() {
        ZonedDateTime oggi = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        String exp = "MARCH";
        String result = testing.ottieniMese(oggi);
        assertEquals(exp, result, "Il risultato dovrebbe essere MARCH");
    }
    @Test
    void ottieniMeseNull(){
        ZonedDateTime oggi = null;
        String result = testing.ottieniMese(oggi);
        assertNull(result, "Il risultato è Null");
    }

    @Test
    void ottieniGiornoMese() {
        ZonedDateTime oggi = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        String exp = "1";
        String result = testing.ottieniGiornoMese(oggi);
        assertEquals(exp, result, "Il risultato dovrebbe essere 1");
    }

    @Test
    void ottieniGiornoMeseNull(){
        ZonedDateTime oggi = null;
        String result = testing.ottieniGiornoMese(oggi);
        assertNull(result, "Il risultato è Null");
    }

    @Test
    void ottieniGiornoSett() {
        ZonedDateTime oggi = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        String exp = "WEDNESDAY";
        String result = testing.ottieniGiornoSett(oggi);
        assertEquals(exp, result, "Il risultato dovrebbe essere WEDNESDAY");
    }

    @Test
    void ottieniGiornoSettNull(){
        ZonedDateTime oggi = null;
        String result = testing.ottieniGiornoSett(oggi);
        assertNull(result, "Il risultato è Null");
    }
}