public class Switch_statement_1 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println("Valore: " + value);
        System.out.println("Giorno della settimana: " + dayOfWeek(value));

    }

    public static String dayOfWeek(int day){
        String result;

        switch (day) {
            case 1:
                result = "Lunedì";
                break;
            case 2:
                result = "Martedì";
                break;
            case 3:
                result = "Mercoledì";
                break;
            case 4:
                result = "Giovedì";
                break;
            case 5:
                result = "Venerdì";
                break;
            case 6:
                result = "Sabato";
                break;
            case 7:
                result = "Domenica";
                break;                                
            default:
                result = "ERRORE";
                break;
        }   return result;
    }
}