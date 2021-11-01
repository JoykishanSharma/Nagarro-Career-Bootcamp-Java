package Assignment1_Nov7;

import java.util.Scanner;

public class HollowRhombusPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfSpace = number - 1;

        while (row <= number) {

            // work : space
            for (int countOfSpace = 1; countOfSpace <= noOfSpace; countOfSpace++) {
                System.out.print(" ");
            }

            // work : star
            for (int countOfStar = 1; countOfStar <= number; countOfStar++) {
                if (row == 1 || row == number || countOfStar == 1 || countOfStar == number)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // changes
            System.out.println();
            row++;
            noOfSpace--;
        }
    }
}
