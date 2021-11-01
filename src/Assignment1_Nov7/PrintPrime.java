package Assignment1_Nov7;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int val = 2;

        while (val <= number) {
            if (isValPrime(val)) {
                System.out.println(val);
            }
            val++;
        }
    }

    public static boolean isValPrime(int val) {

        int counter = 2;
        int flag = 0;

        while (counter <= val / 2) {
            if (val % counter == 0) {
                flag++;
                break;
            }
            counter++;
        }

        return flag == 0;
    }
}
