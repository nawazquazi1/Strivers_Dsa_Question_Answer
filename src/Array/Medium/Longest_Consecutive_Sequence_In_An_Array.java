package Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Longest_Consecutive_Sequence_In_An_Array {

    /*
    Example 1:
    Input:
     [100, 200, 1, 3, 2, 4]

    Output: 4
    Explanation:
     The longest consecutive subsequence is 1, 2, 3, and 4.

    Input:
     [3, 8, 5, 7, 6]

    Output:
     4

    Explanation:
     The longest consecutive subsequence is 5, 6, 7, and 8.
     */

    public static void main(String[] args) {
        System.out.println(longestConsecutive3(new int[]{104, 100, 200, 1, 101, 102, 3, 2, 4, 103}));
    }


    public static int longestConsecutive3(int[] arr) {
        int longest = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        for (int i : arr) {
            if (!set.contains(i - 1)) {
                int counter = 1;
                int x = i;
                while (set.contains(x + 1)) {
                    x += 1;
                    counter += 1;
                }
                longest = Math.max(longest, counter);
            }
        }
        return longest;
    }


    private static boolean linearSearch(int[] arr, int x) {
        for (int j : arr) {
            if (j == x) {
                return true;
            }
        }
        return false;
    }


    public static int longestConsecutive(int[] a) {
        int longest = 1;
        for (int j : a) {
            int x = j;
            int count = 1;
            while (linearSearch(a, x + 1)) {
                x += 1;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static int longestConsecutive2(int[] a) {
        Arrays.sort(a);
        int longest = 1;
        int lastSmall = Integer.MIN_VALUE;
        int count = 0;
        if (a.length == 0) {
            return 0;
        }
        for (int j : a) {
            if (j - 1 == lastSmall) {
                count++;
                lastSmall = j;
            } else if (j != lastSmall) {
                count = 1;
                lastSmall = j;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
