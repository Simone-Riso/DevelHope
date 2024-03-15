package HashSet_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> cestoFrutta = new HashSet<>();

        cestoFrutta.add("Mela");
        cestoFrutta.add("Banana");
        cestoFrutta.add("Pera");
        cestoFrutta.add("Arancia");
        cestoFrutta.add("Uva");
        cestoFrutta.add("Fragola");

        System.out.println("Frutta presente: " + cestoFrutta);

        Iterator<String> iterator = cestoFrutta.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (cestoFrutta.contains(elemento)) {
                iterator.remove();
                System.out.println("Penso proprio che mangerò questa: " + elemento);
            } if (cestoFrutta.isEmpty()) {
                System.out.println("Non c'è più frutta e sei pure ingrassato");
            }
        }
    }
}
