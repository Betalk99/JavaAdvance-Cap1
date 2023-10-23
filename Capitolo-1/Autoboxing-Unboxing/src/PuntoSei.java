public class PuntoSei {
    public static void unboxing(){
        Integer integ = Integer.valueOf(42);
        Double doub = Double.valueOf(3.14159);
        Character charObj = Character.valueOf('A');

        // Unboxing per Integer (da oggetto a tipo primitivo int)
        int unInt = integ;

        // Unboxing per Double (da oggetto a tipo primitivo double)
        double unDouble = doub;

        // Unboxing per Character (da oggetto a tipo primitivo char)
        char unChar = charObj;

        // Stampa i valori unboxed
        System.out.println("Unboxed int: " + unInt);
        System.out.println("Unboxed double: " + unDouble);
        System.out.println("Unboxed char: " + unChar);
    }
}
