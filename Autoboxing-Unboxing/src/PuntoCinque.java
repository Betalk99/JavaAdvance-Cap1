public class PuntoCinque {
    public static void autoboxing(){
        int a = 10;
        double d = 12.3;
        char c = '1';
        // Autoboxin per int
        Integer aa = a;

        //Autoboxing per double
        Double dd = d;

        //Autoboxing per char
        Character cc = c;

        System.out.println("Autoboxed Integer: " + aa);
        System.out.println("Autoboxed Double: " + dd);
        System.out.println("Autoboxed Character: " + cc);
    }
}
