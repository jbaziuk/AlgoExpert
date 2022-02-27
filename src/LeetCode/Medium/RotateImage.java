package LeetCode.Medium;

import java.util.Arrays;

public class RotateImage {

    public static void rotate(int[][] matrix, String direction) {
        printMatrix(matrix);
        int size = matrix.length;
        int layerCount = size / 2;

        for (int layer = 0; layer < layerCount; layer++) {
            int first = layer;
            int last = size - first - 1;

            for (int element = first; element < last; element++) {
                int offset = element - first;

                int topLeft = matrix[first][element];
                int topRight = matrix[element][last];
                int bottomRight = matrix[last][last - offset];
                int bottomLeft = matrix[last - offset][first];

                if (direction.equals("forward")) {
                    matrix[first][element] = bottomLeft;
                    matrix[element][last] = topLeft;
                    matrix[last][last - offset] = topRight;
                    matrix[last - offset][first] = bottomRight;
                } else {
                    matrix[first][element] = topRight;
                    matrix[element][last] = bottomRight;
                    matrix[last][last - offset] = bottomLeft;
                    matrix[last - offset][first] = topLeft;
                }
            }
        }
        printMatrix(matrix);
    }

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

    public static void printMatrixUsingForLoops(int[][] matrix) {
        for (int[] row : matrix)
        {
            for (int column : row)
            {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();
    }



}
