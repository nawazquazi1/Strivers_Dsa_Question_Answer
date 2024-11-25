package Array.Medium;

import java.util.*;

public class Spiral_Traversal_Of_A_Matrix {

    public static List<Integer> printSpiral(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        ArrayList<Integer> ans = new ArrayList<>();

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {

            //right
            for (int i = 0; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;

            // For moving right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(mat[bottom][i]);

                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(mat[i][left]);

                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        //Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        List<Integer> ans = printSpiral(mat);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}
