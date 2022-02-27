package LeetCode.Medium;

import java.util.Arrays;

public class RotateImage {

    public static void rotate90Degrees(int[][] matrix) {
        printMatrix(matrix);
        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i ++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        printMatrix(matrix);
    }

    public static void rotateMatrix90DegreesBackwards(int[][] mat) {
        printMatrix(mat);
        int N = mat.length;
        for (int i = 0; i < N / 2; i++) {
            for (int j = i; j < N - i - 1; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][N - 1 - i]; // Move values from right to top
                mat[j][N - 1 - i] = mat[N - 1 - i][N - 1 - j];  // Move values from bottom to right
                mat[N - 1 - i][N - 1 - j] = mat[N - 1 - j][i]; // Move values from left to bottom
                mat[N - 1 - j][i] = temp; // Assign temp to left
            }
        }
        printMatrix(mat);
    }

    public static int[][] rotateUsingNewMatrixAsResult(int[][] matrix) {
        printMatrix(matrix);
        final int M = matrix.length;
        final int N = matrix[0].length;
        int[][] ret = new int[N][M];
        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                ret[c][M-1-r] = matrix[r][c];
            }
        }
        printMatrix(ret);
        return ret;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println();
    }



}
