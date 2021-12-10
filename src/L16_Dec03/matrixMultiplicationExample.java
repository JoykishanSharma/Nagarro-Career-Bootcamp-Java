package L16_Dec03;

public class matrixMultiplicationExample {
    public static void main(String[] args) {

        int[][] matrix1 = {{1, 2, 3},
            {4, 5, 6}};

        int[][] matrix2 = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};

        int[][] ans = matrixMultiplication(matrix1, matrix2);
        display(ans);

    }

    private static void display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixMultiplication(int[][] one, int[][] two) {

        int r1 = one.length;
        int c1 = one[0].length;

        int r2 = two.length;
        int c2 = two[0].length;

        int[][] resultMatrix = new int[r1][c2];

        for (int row = 0; row < resultMatrix.length; row++) {
            for (int col = 0; col < resultMatrix[0].length; col++) {
                int sum = 0;
                for (int k = 0; k < c1; k++) {
                    sum += one[row][k] * two[k][col];
                }
                resultMatrix[row][col] = sum;
            }
        }

        return resultMatrix;
    }
}
