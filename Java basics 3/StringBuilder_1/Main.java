package StringBuilder_1;

public class Main {
    public static void main(String[] args) {
        String str1 = "CIAO";
        String str2 = "Canguro";

        System.out.println(compareStrings(str1, str2));
    }

    public static String compareStrings(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            return "Le due stringhe sono uguali";
        } else {
            return "Le due stringhe sono differenti";
        }
    }
}

/* public static void main(String[] args) {
    String str1 = "ciao";
    String str2 = "CIAO";

    System.out.println(compareStrings(str1, str2));
}

public static String compareStrings(String str1, String str2) {
    if (str1.compareTo(str2) == 0) {
        return "Le due stringhe sono uguali";
    } else {
        return "Le due stringhe sono differenti";
    }
} */