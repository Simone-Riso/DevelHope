public class Operatori_di_assegnazione_1 {
    public static void main(String[] args) {
        double number1 = 5.0;
        double number2 = 5.0;
        double incremento = 2.0;

        double result = incrementoEMoltiplicazione(number1, number2, incremento);
        System.out.println("Il risultato dell'operazione è: " + result);
    }

    public static double incrementoEMoltiplicazione(double number1, double number2, double incremento) {
        number1 += incremento;
        number2 += incremento;
        double metodResult = number1 * number2;
        return metodResult;
    }
}
