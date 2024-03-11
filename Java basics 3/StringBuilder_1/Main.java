package StringBuilder_1;

public class Main {
    public static void main(String[] args) {
        String stringa1 = "Ciao";
        String stringa2 = "ciao";

        System.out.println(compareStrings(stringa1, stringa2));
    }

    public static String compareStrings(String stringa1, String stringa2) {
        StringBuilder sb1 = new StringBuilder(stringa1);
        StringBuilder sb2 = new StringBuilder(stringa2);

        sb1.setCharAt(0, Character.toLowerCase(sb1.charAt(0)));
        sb2.setCharAt(0, Character.toLowerCase(sb2.charAt(0)));

        if (sb1.toString().equalsIgnoreCase(sb2.toString())) {
            return "Le due stringhe sono uguali";
        } else {
            return "Le due stringhe sono differenti";
        }
    }
}
