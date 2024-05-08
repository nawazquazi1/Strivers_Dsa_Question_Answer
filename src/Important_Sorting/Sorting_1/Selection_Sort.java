package Important_Sorting.Sorting_1;

import java.util.Arrays;

public class Selection_Sort {
    public static int[] selection_Sort(int[] arr) {   // 13, 43, 2, 12, 54, 1, 345, 3, 55
        for (int i = 0; i < arr.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }

            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(selection_Sort(new int[]{13, 43, 2, 12, 54, 1, 345, 3, 55}))
        );
    }

}
