package Important_Sorting.Sorting_1;

import java.util.Arrays;

public class Insertion_Sort {

    public static int[] insertion_sort(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
             }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertion_sort(new int[]{34, 44, 2, 43, 1, 45, 9, 11, 23, 31})));
    }
}
