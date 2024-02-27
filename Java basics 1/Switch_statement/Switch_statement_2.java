package Switch_statement;
public class Switch_statement_2 {
    public static void main(String[] args) {
        char operatore = '-';
        System.out.println("L'operzione del carattere (" + operatore + ") è: " + arithmeticOperator(operatore));
    }

    public static String arithmeticOperator(char operatore) {
        String result;

        switch (operatore) {
            case '+':
                result = "Addizzione";
                break;
            case '-':
                result = "Sottrazione";
                break;
            case '*':
                result = "Moltiplicazione";
                break;
            case '/':
                result = "Divisione";
                break;
            default:
                result = "Errore";
        }
        return result;
    }
}
