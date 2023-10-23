import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> arrayA = new HashSet<>();

        riempiArray(arrayA);
        stampaArray(arrayA);
    }
    public static Set<Integer> riempiArray(Set<Integer> arrayA){
        Random r = new Random();
        for(int i=0; i < 10; i++){
            Integer casualNumber = r.nextInt(1,100);
            arrayA.add(casualNumber);
        }

        return arrayA;
    }

    public static void stampaArray(Set<Integer> arrayA){
        System.out.println("Hashset: " + arrayA);

        System.out.println("Grandezza Hashset: " + arrayA.size());
    }
}