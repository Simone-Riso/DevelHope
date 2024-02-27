public class For_loop_1 {
    public static void main(String[] args) {
        arithmeticTable(5);
    }

    public static void arithmeticTable(int number) {
        System.out.println("La tabellina del " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            String output = number + " x " + i + " = " + result;
            System.out.println(output);
        }
    }
}
