package Assignment2_Nov22;

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();

        printSeries(number1, number2);

    }

    private static void printSeries(int number1, int number2) {

        int count = 1;
        int counter = 1;

        while (counter <= number1) {
            int value = 3 * count + 2;

            if (value % number2 != 0) {
                System.out.println(value);
                counter++;
            }

            count++;
        }
    }

}
