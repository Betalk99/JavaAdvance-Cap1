import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer num = 4;
        Integer den = 0;
        isNull(num, den);
    }

    public static void isNull(Integer num, Integer den){
            if(num == null || den == null){
                throw new IllegalArgumentException("Numeratore o denominatore sono null");
            }
        try{
            System.out.println("Risultato: " + num/den);
        }catch (ArithmeticException e){
            System.out.println("error - impossibile dividere per 0");
        }

    }
}