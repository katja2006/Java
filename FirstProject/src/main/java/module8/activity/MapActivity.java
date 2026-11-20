package module8.activity;

// Needs to be completed
import java.util.HashMap;
import java.util.Map;

public class MapActivity {

    public static void main(String[] args) {
        // 1 - Type code to create a HashMap of key-value pairs
        // where key is id of type String and value is a name
        Map map = new HashMap();
        map.put("1", "Anna");
        map.put("2", "John");
        map.put("3", "Katya");
        map.put("4", "Alex");
        map.put("5", "Eva");

        // 2 - Call print method to print the map passed as its parameter.
        // (Hint: Notice print() is a non-static method, so create an instance of MapActivity)
        MapActivity obj = new MapActivity();
        obj.print(map);

    }

    void print(Map map) {
        // 3 - Type code to print this map (keys and values)
        for (Object key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
