import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 22);
        map.put("David", 35);
        map.put("Eve", 28);

        System.out.println(map);

        Set<String> key = map.keySet();
        Collection<Integer> val = map.values();

        System.out.println(key);
        System.out.println(val);


        Map<String, Integer> mapOrd = new TreeMap<>(map);

        System.out.println(mapOrd);


        for (Map.Entry<String, Integer> entry : mapOrd.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }



    }




}