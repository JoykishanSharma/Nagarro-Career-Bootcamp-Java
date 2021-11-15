package Assignment2_Nov22;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int octalValue = 0;
        int multiplier = 1;

        while (number != 0) {

            int reminder = number % 8;
            octalValue = octalValue + reminder * multiplier;
            multiplier = multiplier * 10;
            number = number / 8;

        }

        System.out.println(octalValue);

    }
}
