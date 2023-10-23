import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Fruit> array1 = new LinkedList<>();

        Fruit f1 = new Fruit("Mela");
        Fruit f2 = new Fruit("Banana");
        Fruit f3 = new Fruit("Fragola");
        Fruit f4 = new Fruit("Kiwi");

        array1.add(f1);
        array1.add(f2);
        array1.add(f3);
        array1.add(f4);

        System.out.println("Array della frutta:  \n ");
        stampaArray(array1);

        Fruit f5 = new Fruit("Arancia");
        Fruit f6 = new Fruit("Pompelmo");

        array1.addFirst(f5);
        array1.addLast(f6);

        System.out.println("\n Array della frutta aggiornato: \n ");
        stampaArray(array1);

    }

    public static void stampaArray(LinkedList<Fruit> array1){
        for(Fruit i : array1){
            System.out.println(i);
        }
    }

}