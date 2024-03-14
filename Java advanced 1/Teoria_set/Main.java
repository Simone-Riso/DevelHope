package Teoria_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> insieme1 = new HashSet<String>(Arrays.asList("1", "2", "3"));
        insieme1.add("4");
        System.out.println("Primo insieme: " + insieme1);

        Iterator<String> iterator = insieme1.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Elemento: " + element);

            if (element == "1") {
                iterator.remove();
            }
        }

        System.out.println("Primo insieme dopo il ciclo: " + insieme1);


        Set<String> insieme2 = new HashSet<>();
        insieme2.add("1");
        insieme2.add("2");
        insieme2.add("3");
        insieme2.remove("3");
        System.out.println("Primo insieme: " + insieme2);
    }

}
