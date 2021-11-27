package L14_Nov27;

import java.util.Scanner;

public class Inverse {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] intArray = takeInputs();
        int[] inverseArray = inverseArray(intArray);
        displayArray(inverseArray);
    }

    private static void displayArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    private static int[] inverseArray(int[] intArray) {

        int[] newArray = new int[intArray.length];

        for (int i = 0; i < intArray.length; i++) {
            newArray[intArray[i]] = i;
        }

        return newArray;
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
