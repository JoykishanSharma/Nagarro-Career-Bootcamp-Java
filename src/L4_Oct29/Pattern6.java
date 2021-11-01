package L4_Oct29;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStars = number;
        int noOfSpaces = 0;

        // go to every row
        while (row <= number) {

            // work : space
            for (int countOfSpace = 0; countOfSpace < noOfSpaces; countOfSpace++) {
                System.out.print("  ");
            }

            // work : stars
            for (int countOfStar = 1; countOfStar <= noOfStars; countOfStar++) {
                System.out.print("* ");
            }

            // changes
            System.out.println();
            row++;
            noOfSpaces += 2;
            noOfStars--;
        }
    }
}
