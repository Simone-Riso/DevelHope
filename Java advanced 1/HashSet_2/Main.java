package HashSet_2;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> newElement = new HashSet<String>();
        newElement.add("Uva");
        newElement.add("Kiwi");

        HashSet<String> setFrutta = setRiempito();
        setFrutta.addAll(newElement);

        Iterator<String> iterator = setFrutta.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Elemento: " + element);
        }
    }

    private static HashSet<String> setRiempito() {
        HashSet<String> setFrutta = new HashSet<String>();

        setFrutta.add("Mela");
        setFrutta.add("Banana");
        setFrutta.add("Arancia");
        setFrutta.add("Mango");
        setFrutta.add("Pera");
        return setFrutta;
    }
}
