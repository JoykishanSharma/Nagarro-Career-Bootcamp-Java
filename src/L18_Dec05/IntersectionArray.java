package L18_Dec05;

import java.util.ArrayList;

public class IntersectionArray {
    public static void main(String[] args) {

        int[] array_one = {10, 20, 30, 40, 40, 50, 50, 60, 60, 70, 70};
        int[] array_two = {5, 10, 10, 30, 60, 70, 70, 70, 80};

        //System.out.println(intersection_approach1(array_one, array_two));
        System.out.println(intersection_approach2(array_one, array_two));

    }

    public static ArrayList<Integer> intersection_approach1(int[] array1, int[] array2) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int k : array1) {
            for (int j = 0; j < array2.length; j++) {
                if (k == array2[j]) {
                    list.add(k);
                    array2[j] = -1;
                    break;
                }
            }
        }

        return list;
    }

    public static ArrayList<Integer> intersection_approach2(int[] array1, int[] array2) {

        ArrayList<Integer> list = new ArrayList<>();

        int i_pointer = 0;
        int j_pointer = 0;

        while (i_pointer < array1.length && j_pointer < array2.length) {
            if (array1[i_pointer] < array2[j_pointer]) {
                i_pointer++;
            }
            else if (array1[i_pointer] > array2[j_pointer]) {
                j_pointer++;
            }
            else {
                list.add(array1[i_pointer]);
                i_pointer++;
                j_pointer++;

            }
        }

        return list;
    }
}
