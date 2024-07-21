package Array.Easay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Union_of_Two_Sorted_Arrays {


    // first approach
    public static int[] union(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (int k : arr1) {
            set1.add(k);
        }
        for (int j : arr2) {
            set1.add(j);
        }
        int[] arr = new int[set1.size()];
        int i = 0;
        for (int s : set1) {
            arr[i++] = s;
        }
        return arr;
    }

    //second approach
    static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int j : arr1) {
            freq.put(j, freq.getOrDefault(j, 0));
        }

        for (int j : arr2) {
            freq.put(j, freq.getOrDefault(j, 0));
        }
        return new ArrayList<>(freq.keySet());
    }


    //third approach
    static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer> Union = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) { // Case 1 and 2
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else { // case 3
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) { // IF any element left in arr1
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) { // If any elements left in arr2
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }

    public static void main(String[] args) {
        int n = 10, m = 7;
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
//        int[] arr = union(arr1, arr2);
        ArrayList<Integer> arr = FindUnion(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : arr)
            System.out.print(val + " ");
    }
}
