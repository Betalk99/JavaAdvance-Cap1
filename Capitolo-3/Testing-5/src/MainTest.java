import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    @Test
    void resultOperaz() {
        ZonedDateTime oggi = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        String exp = "mercoledì 1 marzo 2023 13:00:00 Ora standard dell’Europa centrale";
        String result = testing.resultOperaz(oggi);
        assertEquals(exp, result, "Il risultato dovrebbe essere 'mercoledì 1 marzo 2023 13:00:00 Ora standard dell’Europa centrale'");
    }

    @Test
    void resultOperNull(){
        ZonedDateTime oggi = null;
        String result = testing.resultOperaz(oggi);
        assertNull(result, "Il risultato dovrebbe essere null");
    }
}