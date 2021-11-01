package Assignment1_Nov7;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();

        int count = findLCM(number1, number2);
        System.out.println(count);
    }

    public static int findLCM(int number1, int number2) {

        // finding min, max numbers
        int maxNumber = Math.max(number1, number2);
        int minNumber = Math.min(number1, number2);

        // calculating LCM
        int originalMaxNumber = maxNumber;
        int multiplier = 2;
        while(maxNumber % minNumber != 0) {
            maxNumber = originalMaxNumber * multiplier;
            multiplier++;
        }

        return maxNumber;
    }
}
