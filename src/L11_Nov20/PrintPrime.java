package L11_Nov20;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();
        scanner.close();

        printPrimeInRange(startRange, endRange);

    }

    private static void printPrimeInRange(int startRange, int endRange) {

        for (int i = startRange; i <= endRange; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        int counter = 2;

        while (counter * counter <= num) {
            if (num % counter == 0) {
                return false;
            }
            counter++;
        }

        return true;

    }

}
