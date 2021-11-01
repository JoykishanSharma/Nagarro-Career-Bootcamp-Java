package L6_Oct31;

import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStars = 0;
        int noOfSpaces = number - 1;


        // go to every row
        while (row <= number) {

            int val = number - row + 1;

            // work : space
            for (int countOfSpace = 1; countOfSpace <= noOfSpaces; countOfSpace++) {
                System.out.print("  ");
            }

            // work : number
            for (int countOfStar = 1; countOfStar <= noOfStars; countOfStar++) {
                System.out.print(val + " ");
                val++;
            }

            System.out.print("0 ");

            // work : number
            for (int countOfStar = 1; countOfStar <= noOfStars; countOfStar++) {
                val--;
                System.out.print(val + " ");
            }

            // changes
            System.out.println();

            row++;
            noOfSpaces--;
            noOfStars++;
        }
    }
}
