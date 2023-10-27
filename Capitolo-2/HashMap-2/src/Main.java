import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>(); //creato hashmap

        // Aggiungi coppie chiave-valore
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 22);
        hashMap.put("David", 35);
        hashMap.put("Eve", 28);

        Set<String> key = hashMap.keySet();  //prendo chiavi in un set
        Collection<Integer> val = hashMap.values(); //prendo values in una collection

        System.out.println(key); // stampo solo key
        System.out.println(val); // stampo solo values

        // Stampa i valori non ordinati
        System.out.println("Valori non ordinati:");
        for (Map.Entry<String, Integer> value : hashMap.entrySet()) {
            System.out.println(value);
        }

        // Crea un TreeMap per ordinare i valori
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        // Stampa i valori ordinati in ordine alfabetico non per la value
        System.out.println("\nValori ordinati:");
        for (Map.Entry<String, Integer> a : treeMap.entrySet()) {
            System.out.println(a);
        }

    }
}