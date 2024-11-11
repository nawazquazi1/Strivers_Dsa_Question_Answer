package Array.Easay;

import java.util.Arrays;

public class Rotate_array_by_K_elementsK {



    //first approach   int[]{1, 2, 3, 4, 5, 6, 7}, 7,3)

    public static void rotateRight(int[] arr, int n, int k) {
        if (n == 0)
          return;
        k = k % n;
        if (k > n)
          return;
        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
          temp[i - n + k] = arr[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
          arr[i + k] = arr[i];

          
        }
        for (int i = 0; i < k; i++) {
          arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
      }
    


      // second approach
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

    // third approach
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

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
            System.out.println(Arrays.toString(left_Rotate(new int[]{-1, -100, 3, 99}, 2)));
        }

}
