package Array.Easay;

import java.util.HashMap;

public class Longest_Sub_Array_with_given_Sum_K {

    /*  Example 1:
      Input Format: N = 3, k = 5, array[] = {2,3,5}
      Result: 2
      Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

      Example 2:
      Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
      Result: 3
      Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.

     */
    public static void main(String[] args) {
        System.out.println(longestSubArray(new int[]{2, 3, 5,1,5,1,1,1,1,1}, 5));
        System.out.println(longestSubArray(new int[]{2, 3, 5, 1, 9, 1, 4, 3, 5, 4, 3, 4, 4, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 10, 24));
    }

    //first approach
    public static int longestSubArray(int[] arr, int k) {

        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    // second approach    //{2,3,5,1,9,1,4,3,5,4,3,4,4,2}  k=10
    public static int longestSubArray(int[] arr, int k, int n) {
        int len = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == k) {
                len = Math.max(len, i + 1);
            }

            int rem = sum - k;

            if (map.containsKey(rem)) {
                int a = i - map.get(rem);
                len = Math.max(len, a);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

        }
        return len;
    }


    // third approach

    public static int getLongestSubArray(int[] a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }


}
