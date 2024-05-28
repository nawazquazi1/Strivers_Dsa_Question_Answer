package Recursion;

import java.util.Arrays;

public class Reverse_a_given_Array {

    public static void reverseArray(int[] arr, int start, int end) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {

        int [] arr=new int[]{1,2,3,4,5,6};
        reverseArray(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }
}
