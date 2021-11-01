package Assignment1_Nov7;

import java.util.Scanner;

public class PatternMountain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfSpace = number + 1;
        int noOfStar = 1;

        while (row <= number) {

            int val = 1;

            // work : star
            for (int countOfStar = 1; countOfStar <= noOfStar; countOfStar++) {
                System.out.print(val + "\t");
                val++;
            }

            // work : space
            for (int countOfSpace = 1; countOfSpace <= noOfSpace; countOfSpace++) {
                System.out.print("\t");
            }

            // work : star
            int countOfStar = 1;
            if (row == number) {
                countOfStar = 2;
                val--;
            }
            for ( ; countOfStar <= noOfStar; countOfStar++) {
                val--;
                System.out.print(val + "\t");
            }

            // changes
            System.out.println();
            noOfStar++;
            noOfSpace -= 2;
            row++;
        }

    }
}
