package L5_Oct30;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStars = number;
        int noOfSpaces = 0;

        // go to every row
        while (row <= 2 * number - 1) {

            // work : space
            for (int countOfSpace = 1; countOfSpace <= noOfSpaces; countOfSpace++) {
                System.out.print("  ");
            }

            // work : stars
            for (int countOfStar = 1; countOfStar <= noOfStars; countOfStar++) {
                System.out.print("* ");
            }

            // changes
            System.out.println();
            if (row <= number - 1) {
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
