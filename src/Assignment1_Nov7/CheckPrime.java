package Assignment1_Nov7;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int flag = 0;
        for (int val = 2; val <= number / 2; val++) {
            if (number % val == 0) {
                flag++;
                break;
            }
        }

        if (flag == 0) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
