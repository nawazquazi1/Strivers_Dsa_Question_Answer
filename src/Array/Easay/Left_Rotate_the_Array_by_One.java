package Array.Easay;

import java.util.Arrays;

public class Left_Rotate_the_Array_by_One {


    public static int[] leftRotateByOne(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        newArr[arr.length - 1] = arr[0];
        return newArr;
    }

    public static int[] left_Rotate(int[] arr, int k) {
        int[] newArr = new int[arr.length];
        int j = 0;
        k = k % arr.length;
        for (int i = arr.length - k; i < arr.length; i++) {
            newArr[j++] = arr[i];
        }
        for (int i = 0; i < arr.length - k; i++) {
            newArr[j++] = arr[i];
//            System.out.println(Arrays.toString(newArr));
        }
        System.arraycopy(newArr, 0, arr, 0, arr.length);
        return arr;
    }

    public static int[] rotate(int[] a, int k) {
        k = k % a.length;
        if (k < 0) {
            k += a.length;
        }

        reverse(a, 0, a.length - k - 1);
        reverse(a, a.length - k, a.length - 1);
        reverse(a, 0, a.length - 1);

        return a;
    }

    private static void reverse(int[] a, int li, int ri) {
        while (li < ri) {
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;

            li++;
            ri--;
        }
    }
    //


    public static void main(String[] args) {
        System.out.println(Arrays.toString(left_Rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        System.out.println(Arrays.toString(left_Rotate(new int[]{-1, -100, 3, 99}, 2)));
    }
}
