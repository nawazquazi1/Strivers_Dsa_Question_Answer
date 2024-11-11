package Array.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {

    /*
    Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 6, 5, 8, 11}, 15)));
    }


    // first   approach
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;

                    return arr;
                }
            }
        }
        arr[0] = -1;
        arr[1] = -1;
        return arr;
    }


    /*
    Example 2:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
Result: NO (for 1st variant)
	[-1, -1] (for 2nd variant)
Explanation: There exist no such two numbers whose sum is equal to the target.

     */

    public static int[] two_sum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        arr[0]=arr[1]=-1;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            int req = target - sum;

            if (map.containsKey(req)) {
                arr[0] = map.get(req);
                arr[1] = i;
                return arr;
            }

            map.put(sum, i);
        }
        return arr;
    }



}