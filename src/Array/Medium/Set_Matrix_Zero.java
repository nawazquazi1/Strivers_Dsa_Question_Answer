package Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;

class Set_Matrix_Zero {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(setMetrixZero(new int[][]{{1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}, {1, 0, 0, 1}})));
    }

    public static int[][] setMetrixZero(int[][] arr) {

        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) {
                    markRow(arr, arr.length, i);
                    markCol(arr, arr.length, j);
                    System.out.println(Arrays.deepToString(arr));
                }
            }
        }

        for (int[] arr1 : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (arr1[j] == -1) {
                    arr1[j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));

        return arr;
    }

    private static void markRow(int[][] arr, int m, int i) {
        for (int j = 0; j < m; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
        System.out.println("  ROW : " + Arrays.deepToString(arr));
    }

    private static void markCol(int[][] arr, int n, int j) {
        for (int i = 0; i < n; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
        System.out.println("COL : " + Arrays.deepToString(arr));
    }


    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int[] row = new int[n]; // row array
        int[] col = new int[m]; // col array

        // Traverse the matrix:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark ith index of row wih 1:
                    row[i] = 1;
                    // mark jth index of col wih 1:
                    col[j] = 1;
                }
            }
        }

        // Finally, mark all (i, j) as 0
        // if row[i] or col[j] is marked with 1.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }

   public static ArrayList<ArrayList<Integer>> zero_Matrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // int[] row = new int[n]; --> matrix[..][0]
        // int[] col = new int[m]; --> matrix[0][..]

        int col0 = 1;
        // step 1: Traverse the matrix and
        // mark 1st row & col accordingly:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark i-th row:
                    matrix.get(i).set(0, 0);

                    // mark j-th column:
                    if (j != 0)
                        matrix.get(0).set(j, 0);
                    else
                        col0 = 0;
                }
            }
        }

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) != 0) {
                    // check for col & row:
                    if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }

        //step 3: Finally mark the 1st col & then 1st row:
        if (matrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }


}