import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime oggi = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));

        System.out.println("stampaData: " + resultOperaz(oggi));

    }

    public static String resultOperaz(ZonedDateTime oggi){
        if(oggi == null){
            return null;
        }

        oggi.plusYears(1);
        oggi.minusMonths(1);
        oggi.plusDays(7);

        String stampaData = oggi.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.FULL));

        return stampaData;
    }
}