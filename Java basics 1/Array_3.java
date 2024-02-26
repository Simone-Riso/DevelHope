import java.util.Arrays;

public class Array_3 {
    public static void main(String[] args) {
        int[] values = new int[] { 1, 1, 3, 3, 5, 5 };
        System.out.println("L'array con valori sostituiti è: " + Arrays.toString(removeDuplicates(values)));
    }

    public static int[] removeDuplicates(int[] array) {
        int[] temp = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            } else {
                temp[j++] = -1;
            }
        }
        temp[j++] = array[array.length - 1];
        return temp;
    }
}