package Array.Medium;

public class Kadane_Algorithm_Maximum_Subarray_Sum_in_an_Array {

    /*
    Example 1:
    Input:
    arr = [-2,1,-3,4,-1,2,1,-5,4]

     Output:
     6

     Explanation:
     [4,-1,2,1] has the largest sum = 6.

    Examples 2:
    Input:
    arr = [1]

    Output:
    1
     */
    public static void main(String[] args) {

        System.out.println(maxSubarraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 9));
    }

    // first approach
    public static int maxSubarraySum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }

        }

        return max;
    }

    // second approach
    public static int maxSubarraySum2(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // subarray = arr[i.....j]
                int sum = 0;
                //add all the elements of subarray:
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }


    //third approach
    public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
            }
            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

    public static long maxSubarraySum3(int[] arr, int n) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        int start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                start = i; // starting index
            }
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;

                ansStart = start;
                ansEnd = i;
            }
            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        //printing the subarray:
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]n");
        // To consider the sum of the empty subarray
        // uncomment the following check:
        //if (maxi < 0) maxi = 0;
        return maxi;
    }


}
