package L7_Nov12;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int temp = number;
        int binaryValue = 0;
        int multiplier = 1;

        while (temp != 0) {

            int reminder = temp % 2;
            binaryValue = binaryValue + reminder * multiplier;
            multiplier = 10 * multiplier;
            temp = temp / 2;

        }

        System.out.println("Binary of " + number + " is " + binaryValue);
    }
}
