package Array.Easay;

public class If_an_Array_is_Sorted {

    // first approach
    public static boolean isSorted(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }

        return true;
    }

    // second approach
    public static boolean is_Sorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }

        return true;
    }

    // third approach
    public static boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }
        if (nums[0] < nums[n - 1]) {
            count++;
        }
        return count <= 1;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 10, 9};
        int n = 5;

        System.out.println(isSorted(arr, n));
        System.out.println(check(arr));
    }
}
