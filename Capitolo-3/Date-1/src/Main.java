import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        System.out.println("Data " + date);


        System.out.println("Date Short : " + dataShor(date));

        System.out.println("Date Medium : " + dataMed(date));

        System.out.println("Date Full : " + dataFul(date));

    }

    public static String dataShor(ZonedDateTime date){
        String dateShort = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT));

        return dateShort;
    }

    public static String dataMed(ZonedDateTime date){
        String dateMedium = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM));

        return dateMedium;
    }
    public static String dataFul(ZonedDateTime date){
        String dateFull = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.FULL));

        return dateFull;
    }





}