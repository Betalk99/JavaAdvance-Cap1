import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class Main {
    public static void main(String[] args) {
        ZonedDateTime oggi = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        System.out.println("Oggi: " + oggi);

        String yearData = String.valueOf(oggi.getYear());
        System.out.println("yearData: " + yearData);

        String mouthData = String.valueOf(oggi.getMonth());
        System.out.println("mouthData: " + mouthData);

        String dayData = String.valueOf(oggi.getDayOfMonth());
        System.out.println("dayData: " + dayData);

        String dayWeekData = String.valueOf(oggi.getDayOfWeek());
        System.out.println("dayWeekData: " + dayWeekData);


    }
}