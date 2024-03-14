package HashSet_1;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> setFrutta = setRiempito();

        System.out.println("Numero elementi: " + setFrutta.size());

        System.out.println("Tipi di elementi: ");

        Iterator<String> iterator = setFrutta.iterator();
        while (iterator.hasNext()) {
            String frutta = iterator.next();
            System.out.println(frutta);
        }
    }

    private static HashSet<String> setRiempito() {
        HashSet<String> setFrutta = new HashSet<>();

        setFrutta.add("Mela");
        setFrutta.add("Banana");
        setFrutta.add("Arancia");
        setFrutta.add("Mango");
        setFrutta.add("Pera");
        return setFrutta;
    }
}
