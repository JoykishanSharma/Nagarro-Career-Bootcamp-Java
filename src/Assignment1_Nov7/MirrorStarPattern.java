package Assignment1_Nov7;

import java.util.Scanner;

public class MirrorStarPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfSpace = number / 2;
        int noOfStar = 1;

        while (row <= number) {

            // work : space
            for (int countOfSpace = 1; countOfSpace <= noOfSpace; countOfSpace++) {
                System.out.print("  ");
            }

            // work : star
            for (int countOfStar = 1; countOfStar <= noOfStar; countOfStar++) {
                System.out.print("* ");
            }

            // changes
            System.out.println();
            if (row <= number/2) {
                noOfSpace--;
                noOfStar += 2;
            } else {
                noOfSpace++;
                noOfStar -= 2;
            }
            row++;
        }
    }
}
