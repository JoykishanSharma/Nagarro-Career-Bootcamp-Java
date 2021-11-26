package Assignment3_Nov28;

import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        long tempNumber = number;
        long position = 0;

        while (tempNumber > 0) {
            long lastDigit = tempNumber % 10;
            long invertedDigit = 9 - lastDigit;
            if (countDigit(tempNumber) == 1 && invertedDigit == 0) break;
            if (invertedDigit < lastDigit) {
                long reminder = number % (int) Math.pow(10, position);
                number = number / (int) Math.pow(10, position + 1);
                number = number * 10 + invertedDigit;
                number = number * (int) Math.pow(10, position) + reminder;
            }
            position++;
            tempNumber = tempNumber / 10;
        }

        System.out.println(number);
    }

    public static long countDigit(long number) {
        long counter = 0;

        while (number != 0) {
            number = number / 10;
            counter++;
        }
        return counter;
    }
}
