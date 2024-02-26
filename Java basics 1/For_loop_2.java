public class For_loop_2 {
    public static void main(String[] args) {
        reverseNumber(10, 12);
    }

    public static void reverseNumber(int startingPoint, int maxResult) {
        int start = startingPoint;

        for (int i = 0; i < maxResult; i++) {
            System.out.println(start);
            start++;
        }
    }
}
