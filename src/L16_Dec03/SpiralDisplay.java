package L16_Dec03;

public class SpiralDisplay {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30}};

        spiralDisplay(arr);

    }

    public static void spiralDisplay(int[][] arr) {

        int minrow = 0;
        int maxrow = arr.length - 1;

        int mincol = 0;
        int maxcol = arr[0].length - 1;

        int total = arr.length * arr[0].length;
        int count = 0;

        while (count < total) {
            // first col
            for (int row = minrow; row <= maxrow && count < total; row++) {
                System.out.print(arr[row][mincol] + " ");
                count++;
            }
            mincol++;

            // last row
            for (int col = mincol; col <= maxcol && count < total; col++) {
                System.out.print(arr[maxrow][col] + " ");
                count++;
            }
            maxrow--;

            // last col
            for (int row = maxrow; row >= minrow && count < total; row--) {
                System.out.print(arr[row][maxrow] + " ");
                count++;
            }
            maxcol--;

            // first row
            for (int col = maxcol; col >= minrow && count < total; col--) {
                System.out.print(arr[minrow][col] + " ");
                count++;
            }
            minrow++;
        }
    }
}
