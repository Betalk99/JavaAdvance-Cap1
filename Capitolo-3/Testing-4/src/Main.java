import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class Main {
    public static void main(String[] args) {
        ZonedDateTime oggi = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        System.out.println("Oggi: " + oggi);

        System.out.println("yearData: " + ottieniAnno(oggi));

        System.out.println("mouthData: " + ottieniMese(oggi));

        System.out.println("dayData: " + ottieniGiornoMese(oggi));

        System.out.println("dayWeekData: " + ottieniGiornoSett(oggi));


    }
    public static String ottieniAnno(ZonedDateTime oggi){
        if(oggi == null){
            return null;
        }
        String yearData = String.valueOf(oggi.getYear());

        return yearData;
    }
    public static String ottieniMese(ZonedDateTime oggi){
        if(oggi == null){
            return null;
        }
        String mouthData = String.valueOf(oggi.getMonth());

        return mouthData;
    }
    public static String ottieniGiornoMese(ZonedDateTime oggi){
        if(oggi == null){
            return null;
        }
        String dayData = String.valueOf(oggi.getDayOfMonth());

        return dayData;
    }
    public static String ottieniGiornoSett(ZonedDateTime oggi){
        if(oggi == null){
            return null;
        }
        String dayWeekData = String.valueOf(oggi.getDayOfWeek());

        return dayWeekData;
    }

}