package L14_Nov27;

import java.util.Scanner;

public class BarGraph {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //int[] intArray = takeInputs();
        int[] intArray = { 3, 5, 9, 1, 7};
        displayBarGraph1(intArray);
    }

    private static void displayBarGraph1(int[] intArray) {

        int row = 1;
        int maxHeight = findMax(intArray);

        while (row <= maxHeight) {
            for (int i : intArray) {
                if (row <= maxHeight - i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
            row++;
        }

    }

    private static void displayBarGraph2(int[] intArray) {

        int row = 1;
        int maxHeight = findMax(intArray);

        while (row <= maxHeight) {
            for (int i : intArray) {
                if (row <= maxHeight - i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
            row++;
        }

    }

    private static void displayBarGraph3(int[] intArray) {

        int row = 1;
        int maxHeight = findMax(intArray);

        while (row <= maxHeight) {
            for (int i : intArray) {
                if (row <= maxHeight - i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
            row++;
        }

    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) if (j > max) max = j;
        return max;
    }

    private static int[] takeInputs() {
        System.out.print("Size ? ");
        int number = scanner.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] ? ");
            arr[i] = scanner.nextInt();
            System.out.println();
        }

        return arr;
    }
}
