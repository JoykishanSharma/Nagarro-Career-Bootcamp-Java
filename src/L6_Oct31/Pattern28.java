package L6_Oct31;

import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStars = 1;
        int noOfSpaces = number - 1;

        // go to every row
        while (row <= number) {

            int val = row;

            // work : space
            for (int countOfSpace = 1; countOfSpace <= noOfSpaces; countOfSpace++) {
                System.out.print("\t");
            }

            // work : stars
            for (int countOfStar = 1; countOfStar <= noOfStars; countOfStar++) {
                System.out.print(val + "\t");
                if (countOfStar >= noOfStars / 2 + 1) val--;
                else val++;
            }

            // changes
            System.out.println();
            row++;
            noOfSpaces--;
            noOfStars += 2;
        }
    }
}
