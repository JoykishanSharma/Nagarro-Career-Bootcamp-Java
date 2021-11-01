package L4_Oct29;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStars = number;

        // go to every row
        while (row <= number) {

            // work : stars
            for (int countOfStar = 1; countOfStar <= noOfStars; countOfStar++) {
                System.out.print("* ");
            }

            // changes
            System.out.println();
            row++;
            noOfStars--;

        }
    }
}
