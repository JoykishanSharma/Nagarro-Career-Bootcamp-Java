package Assignment1_Nov7;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit = scanner.nextInt();
        scanner.close();

        int count = countSpecificDigit(number, digit);
        System.out.println(count);
    }

    public static int countSpecificDigit(int number, int digit) {
        int digitCounter = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit == digit) {
                digitCounter++;
            }
            number = number / 10;
        }
        return digitCounter;
    }
}
