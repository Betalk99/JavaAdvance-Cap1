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


        // Stampa i valori non ordinati
        System.out.println("Valori non ordinati:");
        for (Map.Entry<String, Integer> value : hashMap.entrySet()) {
            System.out.println(value);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());

        // Ordina la lista in base ai valori
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // Crea una LinkedHashMap per mantenere l'ordine della lista ordinata
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Stampa i valori ordinati in base ai valori
        System.out.println("Valori ordinati in base ai valori:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}