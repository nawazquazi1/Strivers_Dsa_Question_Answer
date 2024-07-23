package Array.Medium;

import java.util.Arrays;

public class Sort_an_array_of_0s_1s_2s {
    /*
    Example 1:
      Input: nums = [2,0,2,1,1,0]
      Output: [0,0,1,1,2,2]
      Example 2:

      Input: nums = [2,0,1]
      Output: [0,1,2]
     */

    public static void main(String[] args) {
        sortColors2(new int[]{2, 0, 1});
    }

    public static void sortColors(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for (int num : nums) {
            if (num == 0) {
                c1++;
            } else if (num == 1) {
                c2++;
            } else {
                c3++;
            }
        }

        for (int i = 0; i < c1; i++) {
            nums[i] = 0;
        }
        for (int i = c1; i < c1 + c2; i++) {
            nums[i] = 1;
        }
        for (int i = c1 + c2; i < nums.length; i++) {
            nums[i] = 2;
        }
        System.out.println(Arrays.toString(nums));
    }

    // second approach
    public static void sortColors2(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }

        }
        System.out.println(Arrays.toString(nums));
    }


}
