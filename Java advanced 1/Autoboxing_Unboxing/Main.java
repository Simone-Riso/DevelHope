package Autoboxing_Unboxing;

public class Main {
    public static void main(String[] args) {
        printSumInt(5, 3);
        printChar('A');
        printSumInteger(10, 20);
        printCharacter('B');

        int primitiveInt = 10;
        double primitiveDouble = 9.99;
        char primitiveChar = 'X';

        Integer boxedInt = primitiveInt;
        Double boxedDouble = primitiveDouble;
        Character boxedChar = primitiveChar;

        int unboxedInt = boxedInt;
        double unboxedDouble = boxedDouble;
        char unboxedChar = boxedChar;
        
    }

    public static void printSumInt(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("La somma di " + num1 + " e " + num2 + " è: " + sum);
    }

    public static void printChar(char character) {
        System.out.println("Il carattere è: " + character);
    }

    public static void printSumInteger(Integer num1, Integer num2) {
        int sum = num1 + num2;
        System.out.println("La somma di " + num1 + " e " + num2 + " è: " + sum);
    }

    public static void printCharacter(Character character) {
        System.out.println("Il carattere è: " + character);
    }
}
