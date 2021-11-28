package L15_Nov28;

public class Wave {

    public static void main(String[] args) {
        int[][] int2DArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}};
        waveDisplay(int2DArray);
    }

    public static void waveDisplay(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            if (i % 2 == 0) {
                for (int[] ints : arr) {
                    System.out.print(ints[i] + " ");
                }
            }
            else  {
                for (int j = arr.length - 1; j >= 0 ; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
}
