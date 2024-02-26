public class Cicli_avanzati_2 {
    public static void main(String[] args) {
        printNumbers(11);
    }
    public static void printNumbers(int maxNumber) {
        for (int i = 0; i < maxNumber; i++) {
            if (i == 5) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
