public class If_statementes_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Valore " + i);
            System.out.println("Check: " + checkValue(i));
        }
    }

    public static String checkValue(int value) {
        String result = "";

        if (value % 3 == 0 && value % 5 == 0) {
            result = "FizzBuzz";
        } else if (value % 3 == 0) {
            result = "Fizz";
        } else if (value % 5 == 0) {
            result = "Buzz";
        } return result;
    }
}
