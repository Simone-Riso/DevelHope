package HashSet_2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String searchFruit = "Banana";

        if (fruitSet().contains(searchFruit)) {
            System.out.println(searchFruit + " is in the set");
        } else {
            System.out.println(searchFruit + " is not in the set");
        }
    }

    private static HashSet<String> fruitSet() {
        HashSet<String> setFrutta = new HashSet<String>();

        setFrutta.add("Mela");
        setFrutta.add("Banana");
        setFrutta.add("Arancia");
        setFrutta.add("Mango");
        setFrutta.add("Pera");
        return setFrutta;
    }
}
