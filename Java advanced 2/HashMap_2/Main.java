package HashMap_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "uno");
        hashMap.put(2, "due");
        hashMap.put(3, "tre");

        Collection<String> values = hashMap.values();

        List<String> sortedValues = new ArrayList<>(values);

        Collections.sort(sortedValues);

        for (String value : sortedValues) {
            System.out.println(value);
        }
    }
}
