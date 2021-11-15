package Assignment2_Nov22;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int position = 1;
        int inverseValue = 0;

        while (number != 0) {
            int rem = number % 10;
            inverseValue = inverseValue + position * (int) Math.pow(10, rem - 1);
            number = number / 10;
            position++;
        }

        System.out.println(inverseValue);

    }
}
