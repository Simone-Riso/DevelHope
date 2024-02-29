package Primo_progetto_team;

import java.util.Scanner;

public class Calcolatrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un'operazione (Es. 1 + 2): ");
        String operazione = scanner.nextLine();
        scanner.close();

        String tipoOperazione = riconosciOperazione(operazione);
        double risultato = eseguiOperazione(operazione, tipoOperazione);
        System.out.println("Il risultato dell'operazione è: " + risultato);
    }

    public static String riconosciOperazione(String operazione) {
        if (operazione.contains("+")) {
            return "SOMMA";
        } else if (operazione.contains("-")) {
            return "DIFFERENZA";
        } else if (operazione.contains("*")) {
            return "MOLTIPLICAZIONE";
        } else if (operazione.contains("/")) {
            return "DIVISIONE";
        } else if (operazione.contains("^")) {
            return "POTENZA";
        } else {
            return "Operazione non supportata";
        }
    }

    public static double eseguiOperazione(String operazione, String tipoOperazione) {
        String[] operandi = operazione.split("[\\+\\-\\*\\/\\^]");
        double valore1 = Double.parseDouble(operandi[0].trim());
        double valore2 = Double.parseDouble(operandi[1].trim());

        switch (tipoOperazione) {
            case "SOMMA":
                return somma(valore1, valore2);
            case "DIFFERENZA":
                return differenza(valore1, valore2);
            case "MOLTIPLICAZIONE":
                return moltiplicazione(valore1, valore2);
            case "DIVISIONE":
                return divisione(valore1, valore2);
            case "POTENZA":
                return potenza(valore1, valore2);
            default:
                System.out.println("Operazione non supportata");
                return 0;
        }
    }

    public static double somma(double valore1, double valore2) {
        return valore1 + valore2;
    }

    public static double differenza(double valore1, double valore2) {
        return valore1 - valore2;
    }

    public static double moltiplicazione(double valore1, double valore2) {
        return valore1 * valore2;
    }

    public static double divisione(double valore1, double valore2) {
        double quoziente = valore1 / valore2;
        double resto = valore1 % valore2;
        System.out.println("Quoziente: " + quoziente + ", Resto: " + resto);
        return quoziente;
    }

    public static double potenza(double base, double esponente) {
        return Math.pow(base, esponente);
    }
}
