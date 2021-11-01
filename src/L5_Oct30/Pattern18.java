package L5_Oct30;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStars = 1;
        int noOfSpaces = number / 2;

        // go to every row
        while (row <= number) {

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
            if (row <= number / 2) {
                noOfSpaces--;
                noOfStars += 2;
            } else {
                noOfSpaces++;
                noOfStars -= 2;
            }
            row++;

        }
    }
}
