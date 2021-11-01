package Assignment1_Nov7;

import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int num0 = 0;
        int num1 = 1;
        int sum;
        int row = 1;

        // for every row
        while (row <= number) {

            // work
            for (int col = 1; col <= row; col++) {
                if (row == 1) System.out.print("0\t");
                else if (row == 2 && col == 1) System.out.print("1\t");
                else {
                    sum = num0 + num1;
                    System.out.print(sum + "\t");
                    num0 = num1;
                    num1 = sum;
                }
            }

            // changes
            System.out.println();
            row++;
        }


    }
}
