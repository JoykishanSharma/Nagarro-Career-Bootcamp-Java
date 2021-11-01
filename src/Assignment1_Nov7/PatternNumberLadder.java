package Assignment1_Nov7;

import java.util.Scanner;

public class PatternNumberLadder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStars = 1;
        int val = 1;

        // go to every row
        while (row <= number) {

            // work : stars
            for (int countOfStar = 1; countOfStar <= noOfStars; countOfStar++) {
                System.out.print(val + "\t");
                val++;
            }

            // changes
            System.out.println();
            row++;
            noOfStars++;
        }
    }
}
