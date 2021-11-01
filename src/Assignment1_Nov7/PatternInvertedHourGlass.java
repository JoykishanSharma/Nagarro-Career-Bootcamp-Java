package Assignment1_Nov7;

import java.util.Scanner;

public class PatternInvertedHourGlass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStars = 1;
        int noOfSpaces = 2 * number - 1;
        int val = number;

        // go to every row
        while (row <= 2 * number + 1) {

            // work : number
            for (int countOfStar = 1; countOfStar <= noOfStars; countOfStar++) {
                System.out.print(val + " ");
                val--;
            }

            // work : space
            for (int countOfSpace = 1; countOfSpace <= noOfSpaces; countOfSpace++) {
                System.out.print("  ");
            }

            // work : number
            int countOfStar = 1;
            if (row == number + 1) {
                countOfStar = 2;
                val++;
            }
            for ( ; countOfStar <= noOfStars; countOfStar++) {
                val++;
                System.out.print(val + " ");
            }

            // changes
            System.out.println();
            if (row <= number) {
                noOfSpaces -= 2;
                noOfStars++;
            } else {
                noOfSpaces += 2;
                noOfStars--;
            }
            row++;
        }
    }
}
