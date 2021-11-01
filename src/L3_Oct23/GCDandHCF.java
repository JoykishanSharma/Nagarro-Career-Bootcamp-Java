package L3_Oct23;

import java.util.Scanner;

public class GCDandHCF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();

        int numerator = Math.max(number1, number2);
        int denominator = Math.min(number1, number2);

        while (numerator % denominator != 0) {

            int reminder = numerator % denominator;
            numerator = denominator;
            denominator = reminder;
        }

        System.out.println(denominator);
    }
}
