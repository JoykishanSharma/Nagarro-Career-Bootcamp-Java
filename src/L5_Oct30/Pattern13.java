package L5_Oct30;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStars = 1;

        // go to every row
        while (row <= 2 * number - 1) {

            // work : stars
            for (int countOfStar = 1; countOfStar <= noOfStars; countOfStar++) {
                System.out.print("* ");
            }

            // changes
            System.out.println();
            if (row <= number - 1) noOfStars++;
            else noOfStars--;
            row++;

        }
    }
}
