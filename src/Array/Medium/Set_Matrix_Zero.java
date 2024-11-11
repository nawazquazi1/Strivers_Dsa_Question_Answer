package Array.Medium;

import java.util.Arrays;

class Set_Matrix_Zero {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(setMetrixZero(new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } })));
    }

    public static int[][] setMetrixZero(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) {
                    markRow(arr, arr.length, i);
                    markCol(arr, arr.length, j);
                    
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

        return arr;
    }

    private static void markRow(int[][] arr, int m, int i) {
        for (int j = 0; j < m; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    private static void markCol(int[][] arr, int n, int j) {
        for (int i = 0; i < n; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

}