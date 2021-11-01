package Assignment1_Nov7;

import java.util.Scanner;

public class PatternTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfSpace = number - 1;
        int noOfStar = 1;

        while (row <= number) {

            int startingVal = row;

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
            noOfSpace--;
            noOfStar += 2;
            row++;
        }
    }
}
