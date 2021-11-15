package Assignment2_Nov22;

import java.util.Scanner;

public class SumOfOddPlacedAndSumOfEvenPlacedDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int sumOfOddDigits = 0;
        int sumOfEvenDigits = 0;
        int length = countDigits(number);

        for (int i = 1; i <= length; i++) {
            int val = number % 10;
            number = number / 10;
            if (i % 2 != 0) sumOfOddDigits = sumOfOddDigits + val;
            else sumOfEvenDigits = sumOfEvenDigits + val;
        }

        System.out.println(sumOfOddDigits);
        System.out.println(sumOfEvenDigits);
    }

    private static int countDigits(int number) {
        int counter = 0;
        while (number != 0) {
            number = number / 10;
            counter++;
        }
        return counter;
    }
}
