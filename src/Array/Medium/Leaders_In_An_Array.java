package Array.Medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Leaders_In_An_Array {

    /*
    Example 1:
    Input: arr = [4, 7, 1, 0]
    Output  :  7 1 0
    Explanation:Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.

    Example 2:
    Input: arr = [10, 22, 12, 3, 0, 6]
    Output:  22 12 6
    Explanation:
     6 is a leader. In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), also 22 is greater than 12, 3, 0, 6.
         */

    public static void main(String[] args) {
        System.out.println(leaders2(new int[]{10, 22, 12, 3, 0, 6}));
    }


    public static List<Integer> leaders2(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxi = arr[arr.length - 1];
        leaders.add(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxi) {
                maxi = arr[i];
                leaders.add(arr[i]);
            }
        }
        return leaders;
    }

    public static List<Integer> leaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leaders.add(arr[i]);
            }
        }
        return leaders;
    }


}
