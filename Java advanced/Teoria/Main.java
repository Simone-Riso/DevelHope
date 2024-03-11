package Teoria;

public class Main {
    public static void main(String[] args) {

        try {
            String test = "1";
            if (test.equals("1")) {
                throw new ArithmeticException("1");
            }
        } catch (ArithmeticException e) {
            System.out.println("No arithmetic thrown");
        } catch (Exception e) {
            System.out.println("No exception thrown!");
        } finally {
            System.out.println("Finally executed");
        }
    }
}
