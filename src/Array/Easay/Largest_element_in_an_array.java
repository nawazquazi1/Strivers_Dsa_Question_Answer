package Array.Easay;

import java.util.Arrays;

public class Largest_element_in_an_array {


    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 3, 0};
        System.out.println("The Largest element in the array is: " + LargestElementInAnArray(arr1));

        int[] arr2 = {8, 10, 5, 7, 9};
        System.out.println("The Largest element in the array is: " + LargestElementInAnArray(arr2));
    }


    //  first approach
    public static int LargestElementInAnArray(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    // second approach
    public int findLargestElement(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

}
