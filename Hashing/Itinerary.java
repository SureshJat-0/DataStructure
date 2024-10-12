import java.util.HashMap;

public class Itinerary {

    public static String getStart(HashMap<String, String> tick) {
        HashMap<String, String> reverseMap = new HashMap<>();
        for (String key : tick.keySet()) {
            reverseMap.put(tick.get(key), key);
        }

        for (String key : tick.keySet()) {
            if (!reverseMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    public static void printRoots(HashMap<String, String> tick, String start) {
        while (tick.containsKey(start)) {
            System.out.print(start + " -> ");
            start = tick.get(start);
        }
        System.out.println(start);
    }

    public static void main(String[] args) {

        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        printRoots(tickets, start);
    }
}