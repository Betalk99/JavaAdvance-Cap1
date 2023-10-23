/*Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0 e
gestisca sia l'eccezione della divisione che quella di indice non presente nell'array,
leggendone il messaggio. Eseguire sempre un blocco di codice scrivendo un messaggio in console.*/


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Inserisci la lunghezza dell'array: ");
            int lunghezza = scanner.nextInt();
            int[] arrayA = riempiArray(lunghezza);
            stampaArray(arrayA);
            int index = indiceInput(scanner);
            int result = arrayA[index] / 0;
            System.out.println("Risultato: " + result);


        } catch (ArithmeticException e) {
            System.out.println("Errore di divisione per zero ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore di indice non presente nell'array ");
        }
    }
    public static int[] riempiArray(int lunghezza){
        Random rand = new Random();
        int[] arrayB = new int[lunghezza];

        for(int i=0; i<lunghezza; i++){
            arrayB[i] = rand.nextInt(50);
        }

        return arrayB;
    }

    public static void stampaArray(int[] arrayA){
        for (int j : arrayA) {
            System.out.print(" " + j);
        }
    }

    public static int indiceInput(Scanner scanner){
        System.out.println("\n Inserisci indice: ");
        int i = scanner.nextInt();

        return i;
    }

}