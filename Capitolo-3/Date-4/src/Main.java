import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime oggi = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));


        System.out.println("aggiunta anno " + addYears(oggi)); //aggiungi anno
        System.out.println("rimozione mese " + remMonth(oggi)); //rimuovi mese
        System.out.println("aggiunta giorni " + addDays(oggi)); //aggiungi giorno

        System.out.println("stampaData: " + resultOperaz(oggi));

    }

    public static ZonedDateTime addYears(ZonedDateTime oggi){
        return oggi.plusDays(1);
    }

    public static ZonedDateTime remMonth(ZonedDateTime oggi){
        return oggi.minusMonths(1);
    }

    public static ZonedDateTime addDays(ZonedDateTime oggi){
        return oggi.plusDays(7);
    }

    public static String resultOperaz(ZonedDateTime oggi){
        String stampaData = oggi.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.FULL));

        return stampaData;
    }
}