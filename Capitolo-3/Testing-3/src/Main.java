import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime oggi = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        System.out.println("Oggi: " + oggi);

        System.out.println(dataFormattata(oggi));
    }


    public static String dataFormattata(ZonedDateTime oggi){
        if(oggi == null){
            return null;
        }
        String formatDate = oggi.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));

        return formatDate;
    }
}