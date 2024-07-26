package Array.Medium;

import java.util.ArrayList;

public class Rearrange_Array_Elements_by_Sign {

     /*
         Example 1:

        Input:
        arr[] = {1,2,-4,-5}, N = 4
        Output:
        1 -4 2 -5

        Explanation:

        Positive elements = 1,2
        Negative elements = -4,-5
        To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.

        Example 2:
        Input:
        arr[] = {1,2,-3,-1,-2,-3}, N = 6
        Output:
        1 -3 2 -1 3 -2
      */


    // first approach
    public static int[] RearrangebySign(int[] A, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (A[i] > 0) pos.add(A[i]);
            else neg.add(A[i]);
        }
        for (int i = 0; i < n / 2; i++) {
            A[2 * i] = pos.get(i);
            A[2 * i + 1] = neg.get(i);
        }
        return A;
    }

    // secound approcah
    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int nag = 1;

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[nag] = nums[i];
                nag += 2;
            }
        }
        return ans;
    }


    /*
    Input:
    arr[] = {1,2,-4,-5,3,4}, N = 6
    Output:
    1 -4 2 -5 3 4

    Explanation:

    Positive elements = 1,2
    Negative elements = -4,-5
    To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.
    Leftover positive elements are 3 and 4 which are then placed at the end of the array.

     */

    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0) {
                pos.add(A.get(i));
            } else
                neg.add(A.get(i));
        }
        if (pos.size() < neg.size()) {
            for (int i = 0; i < pos.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                A.set(index, neg.get(i));
                index++;
            }
        }
        else {
            for (int i = 0; i < neg.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                A.set(index, pos.get(i));
                index++;
            }
        }
        return A;
    }
    
}
