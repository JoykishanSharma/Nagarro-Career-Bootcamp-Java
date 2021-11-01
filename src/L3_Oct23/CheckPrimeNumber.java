package L3_Oct23;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int counter = 2;
        int factorCount = 0;
        int rootn = (int) Math.sqrt(number);

        while (counter <= rootn) {
            if (number % counter == 0) {
                factorCount = factorCount + 1;
                break;
            }
            counter++;
        }

        if (factorCount == 0) {
            System.out.println("Prime Number!");
        } else {
            System.out.println(counter);
            System.out.println("Not a Prime Number!");
        }
    }
}
