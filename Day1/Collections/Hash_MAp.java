import java.util.*;

public class Hash_MAp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Adding new element to the map
        map.put("Peri", 1);
        map.put("Hello", 25);
        map.put("Karan", 4);
        map.put("Sara", 3);
        map.put("Sheth", 2);
        // Printing the map
        System.out.println(map);
        for (String i : map.keySet()) {
            System.out.println("Key: " + i + " Value: " + map.get(i));
        }
    }
}
