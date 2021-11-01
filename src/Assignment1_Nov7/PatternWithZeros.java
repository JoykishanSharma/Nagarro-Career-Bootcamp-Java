package Assignment1_Nov7;

import java.util.Scanner;

public class PatternWithZeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStars = 1;

        // go to every row
        while (row <= number) {

            // work : stars
            for (int countOfStar = 1; countOfStar <= noOfStars; countOfStar++) {
                if (countOfStar == 1 || countOfStar == noOfStars)
                    System.out.print(row + "\t");
                else
                    System.out.print("0\t");
            }

            // changes
            System.out.println();
            row++;
            noOfStars++;
        }
    }
}
