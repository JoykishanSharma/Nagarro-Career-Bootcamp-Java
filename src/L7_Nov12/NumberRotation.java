package L7_Nov12;

import java.util.Scanner;

public class NumberRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int rotation = scanner.nextInt();
        scanner.close();

        if (rotation < 0) rotation = rotation + countDigits(number);
        else if (rotation > countDigits(number)) rotation = rotation % countDigits(number);

        for (int i = 1; i <= rotation % countDigits(number); i++) {
            int reminder = number % 10;
            number = number / 10;
            int countOfDigits = countDigits(number);
            int power = (int) Math.pow(10, countOfDigits);
            number = reminder * power + number;
        }

        System.out.println(number);
    }

    public static int countDigits(int number) {
        int counter = 0;
        while (number != 0) {
            number = number / 10;
            counter++;
        }
        return counter;
    }
}
