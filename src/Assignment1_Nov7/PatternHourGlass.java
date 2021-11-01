package Assignment1_Nov7;

import java.util.Scanner;

public class PatternHourGlass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStars = 2 * number + 1;
        int noOfSpaces = 0;
        int val = 1;

        // go to every row
        while (row <= 2 * number + 1) {

            int startingVal = number - val + 1;

            // work : space
            for (int countOfSpace = 1; countOfSpace <= noOfSpaces; countOfSpace++) {
                System.out.print("  ");
            }

            // work : number
            for (int countOfStar = 1; countOfStar <= noOfStars; countOfStar++) {
                System.out.print(startingVal + " ");
                if (countOfStar <= noOfStars / 2) startingVal--;
                else startingVal++;
            }

            // changes
            System.out.println();
            if (row <= number) {
                noOfSpaces++;
                noOfStars -= 2;
                val++;
            } else {
                noOfSpaces--;
                noOfStars += 2;
                val--;
            }
            row++;
        }
    }
}
