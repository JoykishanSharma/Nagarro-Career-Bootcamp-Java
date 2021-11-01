package Assignment1_Nov7;

import java.util.Scanner;

public class PascalTrianglePattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStar = 1;

        while (row <= number) {

            // work : star
            for (int countOfStar = 1; countOfStar <= noOfStar; countOfStar++) {
                System.out.print("*\t");
            }

            // changes
            System.out.println();
            noOfStar++;
            row++;
        }
    }
}
