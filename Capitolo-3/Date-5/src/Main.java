import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ZonedDateTime oggi = OffsetDateTime.now().atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        System.out.println("oggi : " + oggi);

        ZonedDateTime primaData = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        System.out.println("primaData : " + primaData);

        ZonedDateTime secondaData = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        System.out.println("secondaData : " + secondaData);


        System.out.println("La prima data è precedente alla seconda: " + isBef(primaData, secondaData));

        System.out.println("La seconda data è successiva alla prima: " + isAft(primaData, secondaData));

        isEqua(primaData, secondaData, oggi);


    }

    public static boolean isBef(ZonedDateTime primaData, ZonedDateTime secondaData){
        return primaData.isBefore(secondaData);
    }

    public static boolean isAft(ZonedDateTime primaData, ZonedDateTime secondaData){
        return primaData.isAfter(secondaData);
    }

    public static void isEqua(ZonedDateTime primaData, ZonedDateTime secondaData,ZonedDateTime oggi){
        if(primaData.isEqual(oggi) && secondaData.isEqual(oggi)){
            System.out.println("Le due date sono uguali ad ora");
        } else if (primaData.isEqual(oggi)) {
            System.out.println("La prima data è uguale ad ora");
        } else if (secondaData.isEqual(oggi)) {
            System.out.println("La seconda data è uguale ad ora");
        } else{
            System.out.println("Le due date non sono uguali alla data odierna");
        }
    }



}