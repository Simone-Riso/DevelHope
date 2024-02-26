public class For_loop_1 {
    public static void main(String[] args) {
        
    }

    public static void arithmeticTable(int number) {
        System.out.println("La tabellina del number: " + number);

        for (int i = 1; i < 11; i++) {
            int result = number + i;
            String output = number + "x" + i + "x" + result;
            System.out.println(output);
        }
    }
}
