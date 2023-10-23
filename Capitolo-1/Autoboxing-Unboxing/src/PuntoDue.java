import java.util.InputMismatchException;
import java.util.Scanner;

public class PuntoDue {
    public static void stampaChar(){
        Scanner reader = new Scanner(System.in);
        try{
            System.out.println("Inserisci char ");
            char car = reader.next().charAt(0);
            System.out.println("Stampa Carattere : " + car);
        }catch (InputMismatchException e){
            System.out.println("Non è un carattere");
        }
    }
}
