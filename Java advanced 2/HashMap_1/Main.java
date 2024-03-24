package HashMap_1;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> firstHashMap = new HashMap<>();

        firstHashMap.put("uno", 1);
        firstHashMap.put("due", 1);
        firstHashMap.put("tre", 1);

        System.out.println("FirstHashMap: ");
        for (HashMap.Entry<String, Integer> element : firstHashMap.entrySet()) {
            System.out.println("Elemento: " + element);
        }

        HashMap<String, Integer> secondHashMap = new HashMap<>(Map.of("uno", 1, "due", 2, "tre", 3));
        System.out.println("SecondHashMap: ");
        for (HashMap.Entry<String, Integer> element : secondHashMap.entrySet()) {
            System.out.println("Elemento: " + element);
        }

        HashMap<String, Integer> thirdHashMap = new HashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Integer>("uno", 1),
            new AbstractMap.SimpleEntry<String, Integer>("due", 2),
            new AbstractMap.SimpleEntry<String, Integer>("tre", 3)
        ));

        System.out.println("ThirdHashMap: ");
        for (Map.Entry<String, Integer> element : thirdHashMap.entrySet()) {
            System.out.println("Elemento: " + element);
        }
    }
}
