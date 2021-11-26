package Assignment3_Nov28;

import java.util.Scanner;

public class OddAndEvenBackInDelhi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            long carNumber = scanner.nextLong();
            checkForSundayDriving(carNumber);
        }

    }

    private static void checkForSundayDriving(long carNumber) {

        long sumOfEvenDigits = 0;
        long sumOfOddDigits = 0;

        while (carNumber > 0) {
            long lastDigit = carNumber % 10;
            if(lastDigit % 2 == 0) sumOfEvenDigits += lastDigit;
            else sumOfOddDigits += lastDigit;
            carNumber /= 10;
        }

        if (sumOfEvenDigits % 4 == 0 || sumOfOddDigits % 3 == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
