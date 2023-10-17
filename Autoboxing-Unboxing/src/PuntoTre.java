import java.util.InputMismatchException;
import java.util.Scanner;

public class PuntoTre {
    public static void sommaInteger(){
        try{
            Scanner integ = new Scanner(System.in);
            System.out.println("Inserisci Integer1 ");
            Integer var1 = integ.nextInt() ;
            System.out.println("Inserisci Integer2 ");
            Integer var2 = integ.nextInt();
            System.out.println("Risultato :" + (var1+var2));
        }catch (InputMismatchException e){
            System.out.println("Non è un integer");
        }
    }
}
