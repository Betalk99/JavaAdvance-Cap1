import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("Hello ", " Map");

        System.out.println(map);

        HashMap<String, String> map1 = new HashMap<String, String>(Map.of("Hello ", " Map1"));
        // OPPURE FARE IN QUESTO MODO ----   Map<String, String> map2 = Map.of("Hello ", " Map1");
        System.out.println(map1);

        HashMap<String,String> map2 = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Hello ", " Map2"),
                new AbstractMap.SimpleEntry<>("Riga", " Due")
        ));

        System.out.println(map2);


    }
}