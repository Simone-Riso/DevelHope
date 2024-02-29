package Arrays;
public class Array_2 {
    public static void main(String[] args) {
        char[] chars = createCharArray();
        char charToFind = 'g';
        System.out.println(
                "Numero occorenze per il carattere: " + charToFind + " : " + findOccurencies(charToFind, chars));
    }

    public static char[] createCharArray() {
        char[] chars = new char[6];
        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = 'c';
        chars[3] = 'd';
        chars[4] = 'e';
        chars[5] = 'f';
        return chars;
    }

    public static int findOccurencies(char toFind, char[] chars) {
        int occ = 0;
        for (char carattere1 : chars) {
            if (carattere1 == toFind) {
                occ++;
            } else if (carattere1 != toFind) {
                System.out.println("Errore");
            } break;
        }
        return occ;
    }
}
