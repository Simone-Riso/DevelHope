package StringBuilder_2;

public class Main {
    public static void main(String[] args) {
        Main unicodeCharacter = new Main("Hello", 2);
        System.out.println(unicodeCharacter.getUnicodeCharacter());
    }

    private String inputString;
    private int index;

    public Main(String inputString, int index) {
        this.inputString = inputString;
        this.index = index;
    }

    public String getUnicodeCharacter() {
        StringBuilder result = new StringBuilder();

        // Controlla se l'indice è valido
        if (index < 0 || index >= inputString.length()) {
            result.append("Errore: Posizione non valida");
        } else {
            char character = inputString.charAt(index);
            int unicodeValue = (int) character;
            result.append("Il carattere Unicode in posizione ")
                    .append(index)
                    .append(" è: ")
                    .append(unicodeValue);
        }

        return result.toString();
    }
}
