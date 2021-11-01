package Assignment1_Nov7;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int reversedNumber = 0;

        while (number != 0) {
            int reminder = number % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            number = number / 10;
        }

        System.out.println(reversedNumber);

    }
}
