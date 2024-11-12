package Array.Easay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Remove_Duplicates_in_place_from_Sorted_Array {

    //first approach
    public static HashSet<Integer> removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
            int k=set.size();
            int j=0;
            for(int x:set){
                nums[j++]=x;
            }
            System.out.println(k);
            System.out.println(Arrays.toString(nums));
        
        return set;
    }

    public static Set<Integer> removeDuplicatesWithStreams(int[] nums) {
    return Arrays.stream(nums)              // Convert the array to an IntStream
                 .boxed()                   // Convert each int to Integer (because Set works with Integer)
                 .collect(Collectors.toSet()); // Collect the elements into a Set
}

    // second  approach

    // int[]{1,1,2,2,2,3,3,3,3,3,3,4,4,4,4,4,}

    static int remove_Duplicates(int[] arr) {
        if (arr.length == 0) return 0; // Early return if the array is empty
        
        int j = 0;  // Initialize j to track the position for unique elements
        
        for (int i = 1; i < arr.length; i++) {  // Start from the second element
            if (arr[i] != arr[j]) {  // If the current element is different from the last unique element
                j++;  // Move the unique element position forward
                arr[j] = arr[i];  // Place the current element in the new position
            }
        }
        return j + 1;  // The length of the array with unique elements
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
        System.out.println(remove_Duplicates(new int[]{1,1,2,2,2,3,3,3,3,3,3,4,4,4,4,4,}));

        System.out.println(removeDuplicates(new int[]{1, 1, 3, 1, 2, 5, 2, 4, 2, 54,3,4,56,35,4,3,2,5,4,3,5,2,3,3,6,56,3,3,2,5,34,523,43,564,5784,2,35,564,5,2,35,5,2,534123,1,32,134,65,376,431,35,345,22121,345,345,1,35,34,3,5423, 3}));
    }
}
