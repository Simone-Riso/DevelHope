package BigDecimal;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        BigDecimal numero1 = new BigDecimal("10.5");
        BigDecimal numero2 = new BigDecimal("2.5");
        OperazioneAritmetica operazione = OperazioneAritmetica.MAX;

        BigDecimal risultato = calcoloOperazione(numero1, numero2, operazione);

        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);
        System.out.println("Operazione: " + operazione);
        System.out.println("Risultato: " + risultato);
    }

    public static BigDecimal calcoloOperazione(BigDecimal numero1, BigDecimal numero2, OperazioneAritmetica operazione) throws Exception {
        BigDecimal risultato = BigDecimal.ZERO;

        switch (operazione) {
            case ADDIZIONE:
                risultato = numero1.add(numero2);
                break;
            case SOTTRAZIONE:
                risultato = numero1.subtract(numero2);
                break;
            case MOLTIPLICAZIONE:
                risultato = numero1.multiply(numero2);
                break;
            case DIVIONE:
                if (numero2.compareTo(BigDecimal.ZERO) != 0) {
                    risultato = numero1.divide(numero2);
                } else {
                    throw new Exception("Errore: Divisione per 0");
                } break;
            case MIN:
                risultato = numero1.min(numero2);
                break;
            case MAX:
                risultato = numero1.max(numero2);
                break;

        } return risultato;
    }
}
