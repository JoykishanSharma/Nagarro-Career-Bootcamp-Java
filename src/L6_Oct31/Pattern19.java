package L6_Oct31;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStars = number / 2 + 1;
        int noOfSpaces = -1;

        // go to every row
        while (row <= number) {

            // work : stars
            for (int countOfStar = 1; countOfStar <= noOfStars; countOfStar++) {
                System.out.print("* ");
            }

            // work : space
            for (int countOfSpace = 1; countOfSpace <= noOfSpaces; countOfSpace++) {
                System.out.print("  ");
            }

            // work : stars
            int countOfStar = 1;
            if (row == 1 || row == number) countOfStar++;
            for ( ; countOfStar <= noOfStars; countOfStar++) {
                System.out.print("* ");
            }

            // changes
            System.out.println();
            if (row <= number / 2) {
                noOfSpaces += 2;
                noOfStars--;
            } else {
                noOfSpaces -= 2;
                noOfStars++;
            }
            row++;

        }
    }
}
