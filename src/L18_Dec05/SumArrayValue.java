package L18_Dec05;

import java.util.ArrayList;

public class SumArrayValue {
    public static void main(String[] args) {

        int[] array_one = {9, 9, 8, 7};
        int[] array_two = {6, 5};

        ArrayList<Integer> sum = addTwoArray(array_one, array_two);
        System.out.println(sum);
    }

    private static ArrayList<Integer> addTwoArray(int[] array_one, int[] array_two) {

        ArrayList<Integer> sumArray = new ArrayList<>();
        int i = array_one.length - 1;
        int j = array_two.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) sum += array_one[i];
            if (j >= 0) sum += array_two[j];

            int lastDigit = sum % 10;
            sumArray.add(0, lastDigit);

            carry = sum / 10;
            i--;
            j--;
        }

        if (carry != 0) sumArray.add(0, carry);

        return sumArray;
    }

}
