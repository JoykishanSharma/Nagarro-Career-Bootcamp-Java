package Assignment1_Nov7;

import java.util.Scanner;

public class PatternRhombus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfSpace = number - 1;
        int noOfStar = 1;
        int val = 1;

        while (row <= 2 * number - 1) {

            int startingVal = val;
            // work : space
            for (int countOfSpace = 1; countOfSpace <= noOfSpace; countOfSpace++) {
                System.out.print("\t");
            }

            // work : star
            for (int countOfStar = 1; countOfStar <= noOfStar; countOfStar++) {
                System.out.print(startingVal + "\t");
                if (countOfStar <= noOfStar / 2) startingVal++;
                else startingVal--;
            }

            // changes
            System.out.println();
            if (row < number) {
                noOfSpace--;
                noOfStar += 2;
                val++;
            } else {
                noOfSpace++;
                noOfStar -= 2;
                val--;
            }

            row++;
        }

    }
}
