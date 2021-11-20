package L11_Nov20;

import java.util.Scanner;

public class PrintArmstrongNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();
        scanner.close();

        printArmstrongNumbersInRange(startRange, endRange);
    }

    private static void printArmstrongNumbersInRange(int startRange, int endRange) {
        for (int i = startRange; i <= endRange; i++) {
            if (isArmstrongNumber(i)) System.out.print(i + " ");
        }
    }

    private static boolean isArmstrongNumber(int num) {
        int temp = num;
        int power = digitCount(num);
        int cubicSum = 0;

        while (temp > 0) {
            int reminder = temp % 10;
            cubicSum = cubicSum + (int) Math.pow(reminder, power);
            temp = temp / 10;
        }

        return cubicSum == num;
    }

    private static int digitCount(int num) {
        int counter = 0;

        while (num > 0) {
            num = num / 10;
            counter++;
        }

        return counter;
    }
}
