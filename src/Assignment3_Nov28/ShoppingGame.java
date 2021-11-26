package Assignment3_Nov28;

import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            long maxAayush = scanner.nextLong();
            long maxHarshit = scanner.nextLong();
            printTheWinner(maxAayush, maxHarshit);
        }
    }

    private static void printTheWinner(long maxAayush, long maxHarshit) {

        long smartphoneCount = 1;
        long aayushPurchase = 0;
        long harshitPurchase = 0;
        while (true) {
            aayushPurchase = aayushPurchase + smartphoneCount;
            smartphoneCount++;
            harshitPurchase = harshitPurchase + smartphoneCount;
            smartphoneCount++;

            if (aayushPurchase >= maxAayush) {
                System.out.println("Harshit");
                break;
            } else if (harshitPurchase >= maxHarshit) {
                System.out.println("Aayush");
                break;
            }
        }
    }
}
