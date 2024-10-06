import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_Map {
    public static void main(String[] args) {
        // Contry ( Key ) Population ( Value )
        HashMap<String, Integer> map = new HashMap<>();

        // Insert
        map.put("India", 130);
        map.put("US", 80);
        map.put("China", 150);

        // Print map
        System.out.println(map); // UnOrder Output

        map.put("China", 180); // This will update the existing Key 

        // Search for Key
        if (map.containsKey("China")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        // Get the value of the Key
        System.out.println(map.get("India"));
        System.out.println(map.get("Japan"));

        System.out.println();

        // Travesing 
        // for (int val : array) --> For each loop 
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        System.out.println();

        // Second Method
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println();
        
        // Remove Key and Value
        map.remove("China");
        System.out.println(map);
    }
}
