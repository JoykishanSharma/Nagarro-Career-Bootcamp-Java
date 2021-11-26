package Assignment3_Nov28;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            sum = sum + number;
            if (sum < 0) break;
            System.out.println(number);
        }
        scanner.close();
    }
}
