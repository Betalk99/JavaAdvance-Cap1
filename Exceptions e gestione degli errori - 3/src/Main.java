/*Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.*/

public class Main {
    public static void main(String[] args) {

        int num = 3;

        divZero(num);
    }

    public static void divZero(int num){

        try {
               System.out.print("Risultato: " + num/0);
        }catch (Exception e){
            System.out.print("Non si può dividere un numero per 0");
        }

    }

}