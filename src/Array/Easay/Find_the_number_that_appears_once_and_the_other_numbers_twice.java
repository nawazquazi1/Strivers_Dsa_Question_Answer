package Array.Easay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Find_the_number_that_appears_once_and_the_other_numbers_twice {



    // first approach

    public static int getSingleElement(int[] arr) {
        //Run a loop for selecting elements:
        // selected element

        ArrayList<Integer> list = new ArrayList<Integer>();


        for (int num : arr) {
            int cnt = 0;
            //find the occurrence using linear search:
            for (int i : arr) {
                if (i == num)
                    cnt++;
            }
            // if the occurrence is 1 return ans now:
            if (cnt == 1) return num;
        }
        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    // second approach

    public static int findTheNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) count=entry.getKey();
        }

        return count;
    }


    // third  approach

    public static int get_Single_Element(int []arr) {
        //size of the array:
        int n = arr.length;
        // Declare the hashmap.
        // And hash the given array:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int j : arr) {
            int value = mpp.getOrDefault(j, 0);
            mpp.put(j, value + 1);
        }
        //Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    // fourth approach

    public static int getSingleElement(int []arr,int n) {

        // XOR all the elements:
        int xorr = 0;
        for (int j : arr) {
            xorr = xorr ^ j;
        }
        return xorr;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr,arr.length);
        System.out.println("The single element is: " + ans);
//        getSingleElement()
    }
}
