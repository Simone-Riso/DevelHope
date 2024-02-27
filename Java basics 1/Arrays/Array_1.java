package Arrays;
public class Array_1 {
    public static void main(String[] args) {
        int[] numbers = createNumbersArray();
        System.out.println("Somma degli elementi: " + calcoloSomma(numbers));
    }

    public static int[] createNumbersArray() {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        } return numbers;
    }

    public static int calcoloSomma(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        } return sum;
    }
}
