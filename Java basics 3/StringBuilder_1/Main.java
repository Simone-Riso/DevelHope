package StringBuilder_1;

public class Main {
    public static void main(String[] args) {
        String str1 = "CIAO";
        String str2 = "Ciao";

        System.out.println(compareStrings(str1, str2));
    }

    public static String compareStrings(String str1, String str2) {
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);

        sb1.setCharAt(0, Character.toLowerCase(sb1.charAt(0)));
        sb2.setCharAt(0, Character.toLowerCase(sb2.charAt(0)));

        if (sb1.toString().equalsIgnoreCase(sb2.toString())) {
            return "Le due stringhe sono uguali";
        } else {
            return "Le due stringhe sono differenti";
        }
    }
}
