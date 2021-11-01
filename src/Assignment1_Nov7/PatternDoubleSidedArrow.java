package Assignment1_Nov7;

import java.util.Scanner;

public class PatternDoubleSidedArrow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfOuterSpace = number - 1;
        int noOfInnerSpace = -1;
        int noOfStar = 1;
        int startingVal = 1;

        while (row <= number) {

            int val = startingVal;

            // work : space
            for (int countOfSpace = 1; countOfSpace <= noOfOuterSpace; countOfSpace++) {
                System.out.print("  ");
            }

            // work : star
            for (int countOfStar = 1; countOfStar <= noOfStar; countOfStar++) {
                System.out.print(val + " ");
                val--;
            }

            // work : space
            for (int countOfSpace = 1; countOfSpace <= noOfInnerSpace; countOfSpace++) {
                System.out.print("  ");
            }

            // work : star
            int countOfStar = 1;
            if (row == 1 || row == number) countOfStar = 2;
            for ( ; countOfStar <= noOfStar; countOfStar++) {
                val++;
                System.out.print(val + " ");
            }

            // changes
            System.out.println();
            if (row <= number / 2) {
                noOfOuterSpace -= 2;
                noOfInnerSpace += 2;
                noOfStar++;
                startingVal++;
            } else {
                noOfOuterSpace += 2;
                noOfInnerSpace -= 2;
                noOfStar--;
                startingVal--;
            }

            row++;
        }
    }
}
