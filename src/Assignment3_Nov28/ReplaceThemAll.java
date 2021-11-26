package Assignment3_Nov28;

import java.util.Scanner;

public class ReplaceThemAll {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        scanner.close();

        long newNumber = 0;
        int position = 0;

        if (number == 0) newNumber = 5;

        while (number > 0) {

            long reminder = number % 10;
            if (reminder == 0) {
                number  = number + 5;
                continue;
            }
            newNumber = (long) Math.pow(10, position) * reminder + newNumber;
            number = number / 10;
            position++;
        }

        System.out.println(newNumber);
    }
}
