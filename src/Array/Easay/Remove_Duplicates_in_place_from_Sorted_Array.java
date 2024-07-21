package Array.Easay;

import java.util.HashSet;

public class Remove_Duplicates_in_place_from_Sorted_Array {

    //first approach
    public static HashSet<Integer> removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

//        System.out.println(set);
        int j = 0;

//        System.out.println(set);
        for (int num : set) {
            nums[j++] = num;
        }
        return set;
    }

    // second  approach

    static int remove_Duplicates(int[] arr) {
        int j = 0;
        for (int i = 1; j < arr.length - 1; j++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

    // third approach
    public int remove_duplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] != nums[i - 1]) {
                nums[count++] = nums[i];
            }
        }
//        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(remove_Duplicates(new int[]{-3, -1, 0, 0, 0, 3, 3}));
        System.out.println(remove_Duplicates(new int[]{1, 1, 3, 1, 2, 5, 2, 4, 2, 3, 3}));
    }
}
