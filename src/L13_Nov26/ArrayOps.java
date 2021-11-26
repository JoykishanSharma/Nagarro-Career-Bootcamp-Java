package L13_Nov26;

import java.util.Scanner;

public class ArrayOps {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //int[] arr = takeInput();
        int[] arr = {10, 20, 30, 40, 50};

        //display(arr);
        //System.out.println("Max value : " + findMax(arr));
        //System.out.println(linearSearch(30, arr));
        System.out.println(binarySearch(0, arr));
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

    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int linearSearch(int item, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) return i;
        }
        return -1;
    }

    public static int binarySearch(int item, int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > item) high = mid - 1;
            else if (arr[mid] < item) low = mid + 1;
            else return mid;
        }

        return -1;
    }
}
