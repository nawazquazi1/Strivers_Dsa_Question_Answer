package Array.Medium;

public class Rotate_Matrix_By_90_Degrees {


    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotated = Rotate_Matrix(arr);
        System.out.println("Rotated Image");
        for (int[] ints : rotated) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }


    public static int[][] Rotate_Matrix(int[][] matrix) {
        int n = matrix.length;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][n - i - 1] = matrix[i][j];
            }
        }
        return arr;
    }


    public static int[][] RotateMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
        return matrix;
    }


}