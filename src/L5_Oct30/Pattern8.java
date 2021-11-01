package L5_Oct30;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int row = 1;

        // go to every row
        while (row <= number) {

            // work in every row
            for (int col = 1; col <= number; col++) {
                if (row == col || row + col == number + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // changes
            System.out.println();
            row++;

        }
    }
}
