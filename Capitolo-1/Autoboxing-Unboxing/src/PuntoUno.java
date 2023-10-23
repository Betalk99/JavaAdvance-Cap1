import java.util.InputMismatchException;
import java.util.Scanner;

public class PuntoUno {
    public static void sommaInt(){
        Scanner in = new Scanner(System.in);
        try{
        System.out.println("Inserisci a ");
        int a = in.nextInt();
        System.out.println("Inserisci b ");
        int b = in.nextInt();
        System.out.println("Risultato : " + (a+b));
        } catch (InputMismatchException e){
        System.out.println("Il numero non è un intero");
        }
    }
}
