import java.util.InputMismatchException;
import java.util.Scanner;

public class PuntoQuattro {
    public static void stampaCharar(){
        Scanner reader = new Scanner(System.in);
        try{
            System.out.println("Inserisci char ");
            Character car1 = reader.next().charAt(0);
            System.out.println("Stampa Carattere : " + car1);
        }catch (InputMismatchException e){
            System.out.println("Non è un carattere");
        }
    }
}
