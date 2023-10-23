import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Studente s1 = new Studente("Bruno", 24);
        Studente s2 = new Studente("Rosa", 26);
        Studente s3 = new Studente("Antonio", 25);

        ArrayList<Studente> array1 = new ArrayList<Studente>(Arrays.asList(s1 ,s2 ,s3)) ;

        System.out.println("array1 " + array1);

        Studente s4 = new Studente("Ciao", 27);
        Studente s5 = new Studente("Pippo", 28);
        Studente s6 = new Studente("Pluto", 29);
        Studente s7 = new Studente("Paperino", 30);

        array1.add(s4);
        array1.add(s5);
        array1.add(s6);
        array1.add(s7);

        System.out.println("array1 con aggiunta  ");
        for(Studente i : array1){
            System.out.println(i);
        }



    }
}