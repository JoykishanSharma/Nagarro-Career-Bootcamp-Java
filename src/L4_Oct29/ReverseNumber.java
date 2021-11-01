package L4_Oct29;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int revNum = 0;

        while (number > 0) {
            int reminder = number % 10;
            number = number / 10;
            revNum = revNum * 10 + reminder;
        }

        System.out.println(revNum);

    }
}
