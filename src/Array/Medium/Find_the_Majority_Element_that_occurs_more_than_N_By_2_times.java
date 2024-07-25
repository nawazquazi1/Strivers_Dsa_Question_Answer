package Array.Medium;

import java.util.HashMap;
import java.util.Map;

public class Find_the_Majority_Element_that_occurs_more_than_N_By_2_times {

    /*
    Example 1:
    Input Format
    : N = 3, nums[] = {3,2,3}
    Result
    : 3
    Explanation
    : When we just count the occurrences of each number and compare with half of the size of the array, you will get 3 for the above solution.

    Example 2:
    Input Format:
      N = 7, nums[] = {2,2,1,1,1,2,2}

    Result
    : 2

    Explanation
    : After counting the number of times each element appears and comparing it with half of array size, we get 2 as result.

     */
    public static void main(String[] args) {
        System.out.println(findMajorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    // first approach
    public static int findMajorityElement(int[] nums) {
        for (int num : nums) {
            int count = 0;
            for (int i : nums) {
                if (num == i) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }

    // second approach
    public static int findMajorityElement2(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            int value = mpp.getOrDefault(num, 0);
            mpp.put(num, value + 1);
        }

        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }

    // third approach  /2, 2, 1, 1, 1, 2, 2
    public int findMajorityElement3(int[] nums) {

        int count = 0;
        int element = 0;
        for (int num : nums) {
            if (count == 0) {
                element = num;
                count = 1;
            } else if (num == element) {
                count++;
            } else {
                count--;
            }
        }
        for (int num : nums) {
            if (num == element) {
                count++;
            }
        }
        if (count > nums.length / 2) {
            return element;
        }
        return -1;
    }
}