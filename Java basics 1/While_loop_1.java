public class While_loop_1 {
    public static void main(String[] args) {
        System.out.println("La somma è uguale a: " + sumOfValues(5));
    }
    
    public static int sumOfValues(int upperBound) {
        int i = 0;
        int sum = 0;

        while (i < upperBound) {
            sum += 1;
            i++;
        } return sum;
    }
}
