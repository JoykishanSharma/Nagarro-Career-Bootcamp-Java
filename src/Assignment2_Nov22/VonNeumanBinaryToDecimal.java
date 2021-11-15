package Assignment2_Nov22;

import java.util.Scanner;

public class VonNeumanBinaryToDecimal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfBinaryNumber = scanner.nextInt();

        while (numberOfBinaryNumber != 0) {

            int number = scanner.nextInt();
            int multiplier = 1;
            int decimalValue = 0;

            while (number != 0) {

                int reminder = number % 10;
                decimalValue = decimalValue + reminder * multiplier;
                multiplier = multiplier * 2;
                number = number / 10;
            }

            System.out.println(decimalValue);
            numberOfBinaryNumber--;
        }

        scanner.close();
    }
}
