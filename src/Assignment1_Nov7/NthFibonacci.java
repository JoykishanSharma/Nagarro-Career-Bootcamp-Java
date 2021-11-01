package Assignment1_Nov7;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        double num0 = 0;
        double num1 = 1;
        double sum = 0;

        int counter = 2;

        while (counter != number + 1) {
            sum = num0 + num1;
            num0 = num1;
            num1 = sum;
            counter++;
        }

        System.out.println(sum);
    }
}
