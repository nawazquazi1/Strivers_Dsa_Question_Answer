package Array.Easay;

import java.util.Arrays;

public class Left_Rotate_the_Array_by_One {

    // first approach
    public static int[] leftRotateByOne(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        newArr[arr.length - 1] = arr[0];
        return newArr;
    }

    static void solve(int arr[], int n) {
        int temp = arr[0]; // storing the first element of array in a variable
        for (int i = 0; i < n - 1; i++) {
          arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp; // assigned the value of variable at the last index
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i]+" ");
        }
    }

  
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRotateByOne(new int[]{1, 2, 3, 4, 5, 6, 7})));
       solve(new int[]{-1, -100, 3, 99}, 2);
    }
}
