package Assignment1_Nov7;

import java.util.Scanner;

public class PascalTrianglePattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStar = 1;

        while (row <= number) {

            // work : star
            for (int countOfStar = 1; countOfStar <= noOfStar; countOfStar++) {
                int val = calculateNCR(row-1, countOfStar - 1);
                System.out.print(val + "\t");
            }

            // changes
            System.out.println();
            noOfStar++;
            row++;
        }
    }

    public static int calculateNCR(int n, int r) {
        return factorial(n)/(factorial(r)* factorial(n - r));
    }

    public static int factorial(int number) {

        int fact = 1;

        while (number >= 1) {
            fact = fact * number;
            number--;
        }

        return fact;
    }
}
