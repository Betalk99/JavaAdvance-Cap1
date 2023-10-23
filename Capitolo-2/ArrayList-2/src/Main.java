import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> array1 = new ArrayList<Student>() ;

        Student s1 = new Student("Bruno", 24);
        Student s2 = new Student("Rosa", 26);
        Student s3 = new Student("Antonio", 25);
        Student s4 = new Student("Ciao", 27);
        Student s5 = new Student("Pippo", 28);
        Student s6 = new Student("Pluto", 29);
        Student s7 = new Student("Paperino", 30);
        Student s8 = new Student("Peppe", 31);
        Student s9 = new Student("Luigi", 23);
        Student s10 = new Student("Antonia", 22);
        Student s11 = new Student("Milo", 20);
        Student s12 = new Student("Papa", 34);

        array1.add(s1);
        array1.add(s2);
        array1.add(s3);
        array1.add(s4);
        array1.add(s5);
        array1.add(s6);
        array1.add(s7);
        array1.add(s8);
        array1.add(s9);
        array1.add(s10);
        array1.add(s11);
        array1.add(s12);

        System.out.println(" \n Array di studenti:  \n ");

        for(Student i : array1){
            System.out.println(i);
        }

        ordArrayListAge(array1);
        System.out.println(" \n Array ordinato tramite l'età degli studenti:  \n ");
        for(Student i : array1){
            System.out.println(i);
        }

    }

    public static ArrayList<Student> ordArrayListAge(ArrayList<Student> array1){
        array1.sort(Comparator.comparing(Student::getAge));

        return array1;
    }



}