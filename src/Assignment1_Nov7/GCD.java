package Assignment1_Nov7;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();

        int val = findGCD(number1, number2);
        System.out.println(val);
    }

    public static int findGCD(int number1, int number2) {

        // arranging denominator , numerator numbers
        int numerator = Math.max(number1, number2);
        int denominator = Math.min(number1, number2);

        // calculating GCD
        while (numerator % denominator != 0) {
            int remainder = numerator % denominator;
            numerator = denominator;
            denominator = remainder;
        }

        return denominator;
    }
}
