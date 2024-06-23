package Array.Easay;

import java.util.ArrayList;

public class Move_all_Zeros_to_the_end_of_the_array {


    public static int[] move_all_Zeros_to_the_end_of_the_array(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int j : arr) {
            if (j != 0) {
                temp.add(j);
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }
        for (int i = temp.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }
    public static int[] moveZeros(int n, int[] a) {
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        //no non-zero elements:
        if (j == -1) {
            return a;
        }
        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }


    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, -2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = move_all_Zeros_to_the_end_of_the_array(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}
