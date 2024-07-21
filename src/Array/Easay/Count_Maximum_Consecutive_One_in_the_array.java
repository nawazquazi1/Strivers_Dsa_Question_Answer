package Array.Easay;

public class Count_Maximum_Consecutive_One_in_the_array {


    // first approach
    public static int findMaxConsecutive(int[] arr) {
        int max = 0;
        int count = 0;
        for (int j : arr) {
            if (j == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1};
        System.out.println(findMaxConsecutive(arr));
    }
}
