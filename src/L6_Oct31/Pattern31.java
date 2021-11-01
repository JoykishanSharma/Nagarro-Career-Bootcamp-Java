package L6_Oct31;

import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int noOfStars = 5;

        // go to every row
        while (row <= number) {

            int val = number;

            // work : stars
            for (int countOfStar = 1; countOfStar <= noOfStars; countOfStar++) {
                if (row + countOfStar == number + 1) System.out.print("*\t");
                else {
                    System.out.print(val + "\t");
                }
                val--;
            }

            // changes
            System.out.println();
            row++;

        }
    }
}
