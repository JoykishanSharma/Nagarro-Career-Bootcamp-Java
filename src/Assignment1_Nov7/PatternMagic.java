package Assignment1_Nov7;

import java.util.Scanner;

public class PatternMagic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStar = number;
        int noOfSpace = -1;

        while (row <= 2 * number - 1) {

            // work : star
            for (int countOfStar = 1; countOfStar <= noOfStar; countOfStar++) {
                System.out.print("*");
            }

            // work : space
            for (int countOfSpace = 1; countOfSpace <= noOfSpace; countOfSpace++) {
                System.out.print(" ");
            }

            // work : star
            int countOfStar = 1;
            if (row == 1 || row == 2 * number - 1) countOfStar = 2;
            for ( ; countOfStar <= noOfStar; countOfStar++) {
                System.out.print("*");
            }

            // changes
            System.out.println();
            if (row < number) {
                noOfStar--;
                noOfSpace += 2;
            } else {
                noOfStar++;
                noOfSpace -= 2;
            }
            row++;
        }

    }
}
