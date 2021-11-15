package Assignment2_Nov22;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            char ch = scanner.next().charAt(0);

            if (ch == 'X' || ch == 'x') break;

            int number1 = 0, number2 = 0;
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                number1 = scanner.nextInt();
                number2 = scanner.nextInt();
            }

            if (ch == '+') System.out.println(number1 + number2);
            else if (ch == '-') System.out.println(number1 - number2);
            else if (ch == '*') System.out.println(number1 * number2);
            else if (ch == '/') System.out.println(number1 / number2);
            else if (ch == '%') System.out.println(number1 % number2);
            else System.out.println("Invalid operation. Try again.");

        }
    }
}
