package L6_Oct31;

import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;
        int val = 1;
        int noOfStars = 1;

        // go to every row
        while (row <= 2 * number - 1) {

            // work : stars
            for (int countOfStar = 1; countOfStar <= noOfStars; countOfStar++) {
                if (countOfStar % 2 == 0) System.out.print("*\t");
                else {
                    System.out.print(val + "\t");
                }

            }

            // changes
            System.out.println();
            if (row <= number - 1) {
                noOfStars += 2;
                val++;
            }
            else {
                noOfStars -= 2;
                val--;
            }
            row++;

        }
    }
}
