package Array.Easay;

import java.util.Arrays;
import java.util.concurrent.LinkedTransferQueue;

public class Reverse_A_Array {


    // first approach

    public static int[] reverse_array(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - i - 1];
        }
        return temp;
    }


    //second approach
    public static int[] reverseArray(int[] arr, int n) {
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[n - i - 1] = arr[i];
        }
        return ans;
    }

    //third approach
    public static int[] reverse_Array(int[] arr, int n) {
        int p1 = 0, p2 = n - 1;
        while (p1 < p2) {
            int tmp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = tmp;
            p1++;
            p2--;
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse_array(new int[]{1, 2, 3, 4, 5, 6})));
    }
}
