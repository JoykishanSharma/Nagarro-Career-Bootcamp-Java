package L14_Nov27;

import java.util.Scanner;

public class Rotation {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //int[] arr = takeInput();
        int[] arr = { 10, 20, 30, 40, 50, 60};
        int noOfRotation = scanner.nextInt();
        rotate3(arr, noOfRotation);
        display(arr);
    }

    private static void rotate1(int[] arr, int noOfRotation) {
        noOfRotation = noOfRotation % arr.length;
        if (noOfRotation < 0) noOfRotation += arr.length;
        for (int i = 0; i < noOfRotation; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j >= 1; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }

    private static int[] rotate2(int[] arr, int noOfRotation) {
        int[] newArray = new int[arr.length];
        noOfRotation = noOfRotation % arr.length;
        if (noOfRotation < 0) noOfRotation += arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (i <= noOfRotation - 1) newArray[i] = arr[i + arr.length - noOfRotation];
            else newArray[i] = arr[i - noOfRotation];
        }
        return newArray;
    }

    private static void rotate3(int[] arr, int noOfRotation) {


    }

    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void display(int[] arr) {

        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    public static int[] takeInput() {
        System.out.print("Size ? ");
        int number = scanner.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] ? ");
            arr[i] = scanner.nextInt();
        }

        return arr;
    }
}
