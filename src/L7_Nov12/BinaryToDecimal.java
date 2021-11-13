package L7_Nov12;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int temp = number;
        int multiplier = 1;
        int decimalValue = 0;

        while (temp != 0) {

            int reminder = temp % 10;
            decimalValue = decimalValue + reminder * multiplier;
            multiplier = multiplier * 2;
            temp = temp / 10;
        }

        System.out.println("Decimal of " + number + " is " + decimalValue);
    }
}
